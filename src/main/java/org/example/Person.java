/*
 *  UCF COP3330 Fall 2021 Person Class file
 *  Copyright 2021 Celina Alzenor
 */
package org.example;

import java.util.Scanner;

public class Person
{
    String name;

    //setting up variable for user input
    Scanner scan = new Scanner(System.in);

    //constructor
    public Person()
    {
        System.out.print("What is your name? ");
        this.name = scan.nextLine();
    }

    void PrintGreeting()
    {
        //if name matches, print custom greeting
        if (this.name.matches("Brian"))
        {
            System.out.print("Whats up, "+this.name +"!");
        }

        else if (this.name.matches("Emily"))
        {
            System.out.print("How are you doing today "+this.name+"?");
        }

        else if (this.name.matches("Michael"))
        {
            System.out.print("Hello "+this.name+"!");
        }

        else if (this.name.matches("Michelin Man"))
        {
            System.out.print("I love tires "+this.name+"!");
        }

        else if (this.name.matches("Batman"))
        {
            System.out.print("The dark knight rises "+this.name+"!");
        }
        //if it's anything else print standard greeting
        else
        {
            System.out.print("Hello "+this.name +", nice to meet you!");
        }
    }
}
