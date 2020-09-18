package org.example;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TestFixturesTest extends TestBase {

    private RequestService requestService = new RequestServiceImpl();
    private RequestHelper requestHelper = new RequestHelperImpl();

    @Test
    void testTestFixtures() {
        requestService.getValue();
    }

}
