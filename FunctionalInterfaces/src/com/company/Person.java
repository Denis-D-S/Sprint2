package com.company;

public class Person {
    private String name = "Jorge";

    //método GET
    public String getName(){
        return name;
    }

    //método SET
    public void setName(String name) {
        this.name = name;
    }

    //método QUALQUER
    public String falar(String fala){
        return fala;
    }
}
