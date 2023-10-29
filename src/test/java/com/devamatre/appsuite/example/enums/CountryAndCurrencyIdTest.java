package com.devamatre.appsuite.example.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.devamatre.appsuite.adtech.entity.CountryAndCurrencyId;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 8/24/20 6:54 PM
 */
public class CountryAndCurrencyIdTest {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryAndCurrencyIdTest.class);

    @Test
    public void testCountryAndCurrencyId() {
        CountryAndCurrencyId id = CountryAndCurrencyId.getCountryAndCurrencyId(null, null);
        assertNull(id);

        id = CountryAndCurrencyId.getCountryAndCurrencyId(Country.IN, null);
        assertNull(id);

        id = CountryAndCurrencyId.getCountryAndCurrencyId(null, Currency.INR);
        assertNull(id);

        id = CountryAndCurrencyId.getCountryAndCurrencyId(Country.IN, Currency.INR);
        assertNotNull(id);
        LOGGER.debug("id:{}", id);
        assertEquals(id, CountryAndCurrencyId.cb14);

    }

}
