package com.company;

public class Person {

    private String name;
    private SexEnum sex;
    private Professional professional;


    public Person(String name, SexEnum sex, Professional professional) {
        this.name = name;
        this.sex = sex;
        this.professional = professional;
    }
}
