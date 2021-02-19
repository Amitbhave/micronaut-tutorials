package com.amitb.bean.qualifier;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class MyApplication {

    private final Logger logger;

    public MyApplication(@Named("file") Logger logger) {
        this.logger = logger;
    }

    public void process() {
        System.out.println("Processing");
        logger.log();
    }

}
