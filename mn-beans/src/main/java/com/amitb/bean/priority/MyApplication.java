package com.amitb.bean.priority;

import javax.inject.Singleton;

@Singleton
public class MyApplication {

    private final Logger logger;

    public MyApplication(Logger logger) {
        this.logger = logger;
    }

    public void process() {
        System.out.println("Processing");
        logger.log();
    }

}
