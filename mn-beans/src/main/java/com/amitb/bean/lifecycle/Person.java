package com.amitb.bean.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Singleton;

@Singleton
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("This will be called after bean initialization");
        name = "Elon Musk";
    }

    @PreDestroy
    private void destroy() {
        System.out.println("This will be called before bean destruction");
    }

}
