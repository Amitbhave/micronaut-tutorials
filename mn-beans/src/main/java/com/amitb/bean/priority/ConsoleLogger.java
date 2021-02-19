package com.amitb.bean.priority;

import javax.inject.Singleton;

@Singleton
public class ConsoleLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Logging to console");
    }

}
