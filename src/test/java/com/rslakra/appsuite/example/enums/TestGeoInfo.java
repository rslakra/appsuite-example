package com.rslakra.appsuite.example.enums;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 3/30/20 4:19 PM
 */
public class TestGeoInfo {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(TestGeoInfo.class);

    @Test
    public void testGeoInfo() {
        
        String bookingCountry = "US";
        String bookingCurrency = "EUR";

        Country country = Country.valueOf(bookingCountry);
        Currency currency = Currency.valueOf(bookingCurrency);
        // US/EUR is not the expected TW/TWD combination, so it must be rejected.
        assertThrows(RuntimeException.class, () -> {
            if (Country.TW != country || Currency.TWD != currency) {
                LOGGER.debug("Invalid advertiser id, country:" + country + ", currency:" + currency);
                throw new RuntimeException("Invalid Input!");
            }
        });
    }
}
