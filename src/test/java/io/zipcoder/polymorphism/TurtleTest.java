package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurtleTest {

    @Test
    public void turleIsPet(){
        Pet turtle = new Turtle();
        Assert.assertTrue(turtle instanceof Turtle);
    }

    @Test
    public void turtleSpeak(){
        Pet turtle = new Turtle();
        String s = "turtle";
        Assert.assertEquals(s, turtle.speak());
    }

}