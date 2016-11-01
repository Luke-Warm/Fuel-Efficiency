/*
 * This code is free software; used for educational purposes
 * you can redistribute ir and/or modify it, as
 * published by Bennett Hack
 *
 * This code is distributed in the hope that it will be useful
 * but WITHOUT ANY WARRANTY; without the implied warranty
 * of usefulness for a particular purpose
 *
 * This contains the main class,
 * you should have both a copy of Vehicle.java, Truck.java
 * Motorcycle.java, Hybrid.java, FuelEfficiency.java (this) and Car.java
 */

package fuelefficiency;

import javax.swing.JOptionPane;

/**
 *
 * @author Bennett Hack
 * behac6513@ugcloud.ca
 */

public class FuelEfficiency {
/**
     * Vehicle item is instantiated 'null' and is reused
     * a loop allows user to generate 4 car objects
     * j option pane allows user to select vehicles from a list
     * another option pane is used to determine fuel parameter
     * <p>
     * getDistance method is used from each class to return
     * fuel efficiency for each given vehicle object
     * 
     * @param args
     * @see object
     */
    public static void main(String[] args) {
        //Create vehicle objects
        Vehicle item = null;

        String choice;
        
        for (int i = 0; i < 4; i++) {
            choice = JOptionPane.showInputDialog(
                    "Vehicle" + "\n"
                    + "1 - Truck\n"
                    + "2 - Car\n"
                    + "3 - Hybrid Car\n"
                    + "4 - Motorcycle");
            if (choice.equals("1")) {
                item = new Truck();
            }
            if (choice.equals("2")) {
                item = new Car();
            }
            if (choice.equals("3")) {
                item = new HybridCar();
            }
            if (choice.equals("4")) {
                item = new Motorcycle();
            }
    //}

    //Return fuel efficiency of vehicle
            String j = JOptionPane.showInputDialog(
                    "Input amount of fuel" + "\n"
            );
            double n = item.getDistance(Double.parseDouble(j));
            System.out.println("Fuel efficiency: " + Double.toString(n) + " Km");
        }
    }

}
