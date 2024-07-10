package io.zipcoder.polymorphism;

import javax.swing.plaf.ButtonUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<String> petList = new ArrayList<>();
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("What kind of pet do u have? (turtle, cat, dog, or bunny)");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine().toLowerCase();

            System.out.println("What is its name?");
            String userInputName = scanner.nextLine();

            switch (userInput) {
                case "cat":
                    Cat cat = new Cat();
                    cat.setName(userInputName);
                    pets.add(cat);
                    break;
                case "dog":
                    Dog dog = new Dog();
                    dog.setName(userInputName);
                    pets.add(dog);
                    break;
                case "bunny":
                    Bunny bunny = new Bunny();
                    bunny.setName(userInputName);
                    pets.add(bunny);
                    break;
                case "turtle":
                    Turtle turtle = new Turtle();
                    turtle.setName(userInputName);
                    pets.add(turtle);
                    break;
                default:
                    System.out.println("pet not recognized; try again");
                    break;
            }
            System.out.println("Do you have any other pets? y/n");
            String cont = scanner.nextLine().toLowerCase();

            if(cont.equals("n")){
                isTrue = false;
                for (Pet p : pets){
                    String name = p.getName();
                    petList.add(name);
                    String speak = p.speak();
                    petList.add(speak);
                }
                System.out.println(petList);
            }
        }
    }
}


