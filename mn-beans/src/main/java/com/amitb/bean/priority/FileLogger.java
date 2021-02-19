package com.amitb.bean.priority;

import io.micronaut.context.annotation.Secondary;

import javax.inject.Singleton;

@Singleton
@Secondary
public class FileLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Logging the message to file");
    }

}
