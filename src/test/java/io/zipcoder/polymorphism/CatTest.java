package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testCatIsPet(){
        Pet cat = new Cat();
        Assert.assertTrue(cat instanceof Cat);
    }

    @Test
    public void testCatSpeak(){
        String s = "meow";
        Pet cat = new Cat();
        Assert.assertEquals(s, cat.speak());
    }

    @Test
    public void getSpeak() {
        Cat cat = new Cat();
        cat.setSpeak("meow");
        String expected = "meow";
        Assert.assertEquals(expected, cat.getSpeak());
    }

    @Test
    public void setSpeak() {
        Cat cat = new Cat();
        cat.setSpeak("meow");
        String expected = "meow";
        Assert.assertEquals(expected, cat.getSpeak());
    }

    @Test
    public void getName() {
        Cat cat = new Cat();
        cat.setName("Whiskers");
        String expected = "Whiskers";
        Assert.assertEquals(expected, cat.getName());
    }

    @Test
    public void setName() {
        Cat cat = new Cat();
        cat.setName("Whiskers");
        String expected = "Whiskers";
        Assert.assertEquals(expected, cat.getName());
    }
}