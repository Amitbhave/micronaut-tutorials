package com.amitb.bean.lifecycle;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class PersonTest {

    @Inject
    private Person person;

    @Test
    void shouldInitializePerson() {
        assertEquals("Elon Musk", person.getName());
    }

}