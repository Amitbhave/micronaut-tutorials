package com.amitb.bean.qualifier;

import javax.inject.Singleton;

@Singleton
public class ConsoleLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Logging to console");
    }

}
