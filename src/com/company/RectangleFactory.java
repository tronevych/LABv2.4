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

public class RectangleFactory {
    public static Rectangle create(int sideA, int sideB, double Angle){

        Rectangle rectangle = new Rectangle(sideA, sideB, Angle);

        return rectangle;
    }
}
