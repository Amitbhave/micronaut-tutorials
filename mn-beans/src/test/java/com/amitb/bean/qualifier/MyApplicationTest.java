package com.amitb.bean.qualifier;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class MyApplicationTest {

    @Inject
    private MyApplication myApplication;

    @Test
    void shouldLogToFile() {
        myApplication.process();
    }

}