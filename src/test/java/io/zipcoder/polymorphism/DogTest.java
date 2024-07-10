package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testDogIsPet(){
        Pet dog = new Dog();
        Assert.assertTrue(dog instanceof Dog);
    }

    @Test
    public void testDogSpeak(){
        Pet dog = new Dog();
        String s = "woof";
        Assert.assertEquals(s, dog.speak());
    }

    @Test
    public void getSpeak() {
        Dog dog = new Dog();
        dog.setSpeak("woof");
        String expected = "woof";
        Assert.assertEquals(expected, dog.getSpeak());
    }

    @Test
    public void setSpeak() {
        Dog dog = new Dog();
        dog.setSpeak("woof");
        String expected = "woof";
        Assert.assertEquals(expected, dog.getSpeak());
    }

    @Test
    public void getName() {
        Dog dog = new Dog();
        dog.setName("George");
        String expected = "George";
        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void setName() {
        Dog dog = new Dog();
        dog.setName("George");
        String expected = "George";
        Assert.assertEquals(expected, dog.getName());
    }
}