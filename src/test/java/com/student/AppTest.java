package com.student;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    @Test
    public void testEligible() {
        App app = new App();
        String result = app.calculateStatus(80, 100);
        assertTrue(result.contains("Eligible"));
    }

    @Test
    public void testWarning() {
        App app = new App();
        String result = app.calculateStatus(60, 100);
        assertTrue(result.contains("WARNING"));
    }
}mvn clean test