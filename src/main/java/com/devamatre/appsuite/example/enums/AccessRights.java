package com.devamatre.appsuite.example.enums;

import java.util.Arrays;

/**
 * https://web.mit.edu/ghudson/dev/nokrb/third/cyrus-imapd/doc/overview.html
 *
 * <pre>
 * Access Rights
 * The defined rights are:
 * l
 * lookup - The user may see that the mailbox exists.
 * r
 * read - The user may read the mailbox. The user may select the mailbox, fetch data, perform searches, and copy messages from the mailbox.
 * s
 * seen - Keep per-user seen state. The "Seen" and "Recent" flags are preserved for the user.
 * w
 * write - The user may modify flags and keywords other than "Seen" and "Deleted" (which are controlled by other sets of rights).
 * i
 * insert - The user may insert new messages into the mailbox.
 * p
 * post - The user may send mail to the submission address for the mailbox. This right differs from the "i" right in that the delivery system inserts trace information into submitted messages.
 * c
 * create - The user may create new sub-mailboxes of the mailbox, or delete or rename the current mailbox.
 * d
 * delete - The user may store the "Deleted" flag, and perform expunges.
 * a
 * administer - The user may change the ACL on the mailbox.
 * </pre>
 * <p>
 * With any authorization mechanism, two special identifiers are defined. The identifier "anonymous" refers to the
 * anonymous, or unauthenticated user. The identifier "anyone" refers to all users, including the anonymous user.
 * <p>
 * <p>
 * Calculating Users' Rights
 * <p>
 * To calculate the set of rights granted to a user, the server first calculates the union of all of the rights granted
 * to the user and to all groups the user is a member of. The server then calculates and removes the union of all the
 * negative rights granted to the user and to all groups the user is a member of.
 * <p>
 * For example, given the ACL:
 * <pre>
 *    anyone       lrsp
 *    fred         lwi
 *    -anonymous   s
 * </pre>
 * The user "fred" will be granted the rights "lrswip" and the anonymous user will be granted the rights "lrp".
 *
 * @author Rohtash Lakra
 * @created 10/25/23 5:25PM
 */

public enum AccessRights {

    ADMINISTER('a', "The user may change the ACL on the mailbox."),
    ANONYMOUS('y', "anonymous"),
    ANYONE('*', "anyone"),
    CREATE('c', "The user may create new sub-mailboxes of the mailbox, or delete or rename the current mailbox."),
    DELETE('d', "The user may store the \"Deleted\" flag, and perform expunges."),
    INSERT('i', "The user may insert new messages into the mailbox."),
    LOOKUP('l', "The user may see that the mailbox exists."),
    POST('p',
         "The user may send mail to the submission address for the mailbox. This right differs from the \"i\" right in that the delivery system inserts trace information into submitted messages."),
    READ('r',
         "The user may read the mailbox. The user may select the mailbox, fetch data, perform searches, and copy messages from the mailbox."),
    SEEN('s', "Keep per-user seen state. The \"Seen\" and \"Recent\" flags are preserved for the user."),
    WRITE('w',
          "The user may modify flags and keywords other than \"Seen\" and \"Deleted\" (which are controlled by other sets of rights)."),
    ;

    private final char access;
    private final String description;

    /**
     * @param access
     * @param description
     */
    AccessRights(char access, String description) {
        this.access = access;
        this.description = description;
    }


    /**
     * Returns the <code>AccessRights</code> object for the provided <code>accessRights</code> string.
     *
     * @param accessRights
     * @return
     */
    public static AccessRights ofString(final String accessRights) {
        return Arrays.stream(values())
            .filter(entry -> entry.name().equalsIgnoreCase(accessRights))
            .findFirst()
            .orElse(null);
    }
}
