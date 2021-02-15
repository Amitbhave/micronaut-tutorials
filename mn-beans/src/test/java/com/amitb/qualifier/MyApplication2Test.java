package com.amitb.qualifier;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class MyApplication2Test {

    @Inject
    private MyApplication myApplication;

    @Test
    void shouldLogToConsole() {
        myApplication.process();
    }

}