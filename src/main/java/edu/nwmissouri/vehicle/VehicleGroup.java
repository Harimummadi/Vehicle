package edu.nwmissouri.vehicle;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of RollsRoyces
 *
 * @author Denise Case
 */
public class VehicleGroup {

    private static ArrayList<RollsRoyce> myGroup;

    /**
     * Create a static group of RollsRoyces
     *
     * @return the number of vehicles in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        RollsRoyce a = new RollsRoyce("Abbie");
        myGroup.add(a);
        myGroup.add(new RollsRoyce("Boss"));
        myGroup.add(new RollsRoyce("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the vehicles!");
        myGroup.forEach(vehicle -> {
            vehicle.make();
            vehicle.model();
        });
        System.out.println("Nice vehicles - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
