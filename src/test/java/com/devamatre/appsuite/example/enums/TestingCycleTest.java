package com.devamatre.appsuite.example.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.devamatre.appsuite.core.enums.TestingCycle;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 1/7/22 11:21 AM
 */
public class TestingCycleTest {


    // LOGGER
    private final Logger LOGGER = LoggerFactory.getLogger(TestingCycleTest.class);

    @Test
    public void testTestingCycle() {
        TestingCycle testingCycle = TestingCycle.ofString(null);
        LOGGER.debug("testingCycle:{}", testingCycle);
        assertNull(testingCycle);

        testingCycle = TestingCycle.ofString(TestingCycle.BLACKBOX.name());
        LOGGER.debug("testingCycle:{}", testingCycle);
        assertNotNull(testingCycle);
        assertEquals(TestingCycle.BLACKBOX, testingCycle);

        testingCycle = TestingCycle.ofString("BLACKBOX");
        LOGGER.debug("testingCycle:{}", testingCycle);
        assertNotNull(testingCycle);
        assertEquals(TestingCycle.BLACKBOX, testingCycle);

        testingCycle = TestingCycle.ofString("BlackBox");
        LOGGER.debug("testingCycle:{}", testingCycle);
        assertNotNull(testingCycle);
        assertEquals(TestingCycle.BLACKBOX, testingCycle);

        testingCycle = TestingCycle.ofString("Blackbox");
        LOGGER.debug("testingCycle:{}", testingCycle);
        assertNotNull(testingCycle);
        assertEquals(TestingCycle.BLACKBOX, testingCycle);

        testingCycle = TestingCycle.ofString("white");
        LOGGER.debug("testingCycle:{}", testingCycle);
        assertNull(testingCycle);
    }

}
