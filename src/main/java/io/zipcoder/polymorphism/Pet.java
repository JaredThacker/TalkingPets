package io.zipcoder.polymorphism;

public class Pet {
    public String name;
    public String speak;

    public Pet(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    public Pet() {
    }

    public String speak(){
        return "I Speak";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
