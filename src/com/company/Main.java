/*
 *
 * Programming patterns. Factory, Builder.
 *
 * 09 June 2020
 *
 * Copyright Serhii Tronevych KNUTE
 *
 * Module 2 task 4
 *
 *Develop for your class
*1. Factory.
*2. Abstract factory.
*3. Create a class Student  - 25 fields.
*4. Create a builder for the class Student/
 *
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        // Rectangle Factory

        Rectangle rectangle1 = RectangleFactory.create(2, 5, Math.PI / 3);
        System.out.println(rectangle1);

        // Abstract Rectangle Factory

        Rectangle pr1 = AbstractFactoryRectangle.create(4, 6, Math.PI / 4);
        System.out.println(pr1);
    }


}

