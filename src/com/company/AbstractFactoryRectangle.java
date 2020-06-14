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

public class AbstractFactoryRectangle {


     //AbstractFactoryRectangle with parameters
     //@param sideA int, set the Rectangle or Rhombus side A
     //@param sideB int, set the Rectangle side B
     //@param angle int, set the Rectangle or Rhombus angle

    public static Rectangle create(int sideA, int sideB, double angle){
        if (sideA == sideB ) {return
                new Rhombus (sideA, angle);
        } else return
                new Rectangle(sideA, sideB, angle);

    }
}