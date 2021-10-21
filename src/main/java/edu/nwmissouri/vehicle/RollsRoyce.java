/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.vehicle;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class RollsRoyce extends Vehicle {

    public RollsRoyce(String name) {
        super(name);
    }

    @Override
    public void make() {
        System.out.println("I am a Rolls Royce");
    }

    @Override
    public void model() {
        System.out.println("Phantom is the best model in Rolls Royce");
    }

    public static void main(String[] args) {
        RollsRoyce rollsRoyce = new RollsRoyce("Phantom");
        rollsRoyce.make();
        rollsRoyce.model();
    }

}
