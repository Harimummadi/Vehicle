package edu.nwmissouri.vehicle;

/**
 * Animal super class for traits shared by all animals. Abstract - don't make a
 * general animal - only specific types.
 *
 * @author Dr. Case
 */
public abstract class Vehicle {
    
    protected String name = "no name";

    public Vehicle(String name) {
        this.name = name;
    }

    public void make() {
        System.out.println("Generic vehicle make");
    }

    public void model() {
        System.out.println("Generic vehicle model");
    }
}
