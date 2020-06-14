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

import java.util.Objects;

public class Rectangle {

    private int sideA;
    private int sideB;
    private double Angle;

    public Rectangle() {
    }

    public Rectangle(int sideA, int sideB) {
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public double getAngle() {
        return Angle;
    }

    public void setAngle(double angle) {
        Angle = angle;
    }

    public Rectangle(int sideA, int sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        Angle = angle;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", Angle=" + Angle +
                '}';
    }
}