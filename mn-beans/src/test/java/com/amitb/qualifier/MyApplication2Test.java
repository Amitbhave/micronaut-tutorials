package com.amitb.qualifier;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class MyApplication2Test {

    @Inject
    private MyApplication2 myApplication2;

    @Test
    void shouldLogToConsole() {
        myApplication2.process();
    }

}