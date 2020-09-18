package org.example;

import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    private final TestHelper helper;

    public TestBase() {
        this.helper = new TestHelper();
    }

    @BeforeEach
    public void setUp() {
        helper.setUp();
    }

}
