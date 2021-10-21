package edu.nwmissouri.vehicle;

import java.util.Scanner;


public class VehicleApp {

    // Specify welcome message
    private static final String GREETING_MESSAGE = "Welcome to our 542 Vehicles Showroom!";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our Vehicles Showroom!";

    // specify number of  vehicle types available 
    private static final int NUMBER_VEHICLE_TYPES = 12;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

        // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape 
        System.out.println(ESCAPE_MESSAGE);

        // construct Scanner and begin interaction
        var scanner = new Scanner(System.in);

        // Prompt for topic: ask if they want to see vehicles
        System.out.println("Do you want to see the available vehicles (y/n)?");
        var vehicleInterestInput = scanner.next();

        // if yes, show list
        if (vehicleInterestInput.toUpperCase().startsWith("Y")) {

            // declare an int for the vehicle type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see vehicles
                System.out.println();
                System.out.println("What vehicles would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");

                System.out.print(" 1. ROLLS ROYCE            ");
                System.out.print(" 2. FERRARI          ");
                System.out.print(" 3. LAMBORGHINI         ");
                System.out.println(" 4. PORSCHE                 ");
                System.out.print(" 5. BUGGATI             ");
                System.out.print(" 6. TESLA         ");
                System.out.print(" 7. LAND ROVER         ");
                System.out.println(" 8. LEXUS        ");
                System.out.print(" 9. JAGUAR       ");
                System.out.print("10. BENZ             ");
                System.out.print("11. AUDI                 ");
                System.out.println("12. BMW             ");
                
                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                // set isValid if >= 1 and <= number of vehicle types
                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_VEHICLE_TYPES;

                // switch by vehicle type - autogenerate with VehicleBuildSwitch.java
                switch (typeNumberInput) {
                    case 1 -> {
                        VehicleGroup.create();
                        VehicleGroup.run();
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> {
                    }
                    case 6 -> {
                    }
                    case 7 -> {
                    }
                    case 8 -> {
                    }
                    case 9 -> {
                    }
                    case 10 -> {
                    }
                    case 11 -> {
                    }
                    case 12 -> {
                    }
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (isValid);

            // close the if loop
        } // Prompt for adventures: ask if they want to try an adventure
        //        System.out.println("Do you want to go on an adventure (y/n)?");
        //        var adventureInterestInput = scanner.next();
        //        if (adventureInterestInput.toUpperCase().startsWith("Y")) {
        //            System.out.println("Sorry - this option is not yet available.");
        //        }
        // output goodbye
        System.out.println(GOODBYE_MESSAGE);

    }

}
