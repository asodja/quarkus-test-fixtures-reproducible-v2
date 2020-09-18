package org.example;

import com.googlecode.objectify.ObjectifyService;

public class TestHelper {

    public void setUp() {
        ObjectifyService.init(new OfyFactory());
    }

}