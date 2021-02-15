package com.amitb.qualifier;

import javax.inject.Singleton;

@Singleton
public class FileLogger implements Logger {


    @Override
    public void log() {
        System.out.println("Logging the message to file");
    }

}
