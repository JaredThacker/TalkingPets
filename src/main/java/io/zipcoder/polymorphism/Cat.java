package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat() {
        super();
    }

    @Override
    public String speak() {
        return "meow";
    }
}
