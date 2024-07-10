package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunnyTest {

    @Test
    public void testBunnyIsPet(){
        Pet bunny = new Bunny();
        Assert.assertTrue(bunny instanceof Bunny);
    }

    @Test
    public void bunnySpeak(){
        String s = "whats up doc";
        Pet bunny = new Bunny();
        Assert.assertEquals(s, bunny.speak());
    }

    @Test
    public void getSpeak() {
        Bunny bunny = new Bunny();
        bunny.setSpeak("whats up doc");
        String expected = "whats up doc";
        Assert.assertEquals(expected, bunny.getSpeak());
    }

    @Test
    public void setSpeak() {
        Bunny bunny = new Bunny();
        bunny.setSpeak("whats up doc");
        String expected = "whats up doc";
        Assert.assertEquals(expected, bunny.getSpeak());
    }

    @Test
    public void getName() {
        Bunny bunny = new Bunny();
        bunny.setName("bunny");
        String expected = "bunny";
        Assert.assertEquals(expected, bunny.getName());
    }

    @Test
    public void setName() {
        Bunny bunny = new Bunny();
        bunny.setName("bunny");
        String expected = "bunny";
        Assert.assertEquals(expected, bunny.getName());

    }
}