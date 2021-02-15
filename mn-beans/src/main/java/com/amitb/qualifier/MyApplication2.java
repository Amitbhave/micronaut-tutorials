package com.amitb.qualifier;

public class MyApplication2 {

    private final Logger logger;

    public MyApplication2(@Console Logger logger) {
        this.logger = logger;
    }

    public void process() {
        System.out.println("Processing..");
        logger.log();
    }

}