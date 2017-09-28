/*
      Course: CS 27500
      Name: Xavier Richardon
      Email: xarichar@pnw.edu
      Assignment: 1
*/

/**
   This program simulates some of the of the behavior of a real car.
   In this Car class, there are three (private) instance variables:
       one for fuel efficiency (representing miles per gallon)
       one for fuel level (representing gallons)
       one for variable that acts as an odometer (representing miles).

*/

import java.awt.*;
import java.util.*;

public class Car {
 private double fuelEfficiency; //representing miles per gallon
 private double fuelLevel; //representing gallons
 private double odometer; //representing miles

  /**
 *   This constructor initializes the odometer & fuelLevel to zero and fuelEfficiency to the users input
 *   @perm The miles per gallon the car can travel
 *   @return The miles per gallon, gallons and miles to the drive and addFuel methods
 *
 */

 public Car( double aFuelEfficiency) {

     fuelEfficiency=aFuelEfficiency;
     this.fuelLevel=0.0;
     this.odometer=0.0;
    }

/**
 *   Allows the user to see the fuelEfficiency variable value by asking
 *   @return The private fuelEfficiency asked for by the user
 */

 public double getFuelEfficiency(){
  return fuelEfficiency;
 }

 /**
 *   Allows the user to see the fuelLevel variable value by asking
 *   @return The private FuelLevel variable asked for by the user
 */

 public double getFuelLevel() {
  return fuelLevel;
 }

 /**
 *   Allows the user to see the odometer variable value by asking
 *   @return The private Odometer variable asked for by the user
 */

 public double getOdometer() {
  return odometer;
 }

/**
 *   Adds a specified amount to the fuel level and returns the new fuel level
 *   @perm The amount of gallons that'll be added to the car
 *   @return The new fuel level after adding a specified amount of fuel
 */

 public double addFuel(double gallons){
     double newFuelLevel=0;
     newFuelLevel=fuelLevel+gallons;
     fuelLevel=newFuelLevel;
     return newFuelLevel;
 }

 /**
 *   Simulates driving the car a specified distance and adjusts the fuel level by the amount of fuel used and adjusts the odometer by the amount of miles driven
 *   @perm The amount of gallons that'll be added to the car
 *   @return The number of miles driven after the the fuel level and the odometer are altered by it
 *
 */

 public double drive(double miles){

   double fuelUsed=miles/fuelEfficiency; // fuelUsed=(miles/gallons)/miles= gallons
   double distance;

   if (fuelLevel<fuelUsed)
   {
     distance=fuelEfficiency*fuelLevel;
     fuelLevel=0;
   }
   else
   {
     fuelLevel=fuelLevel-fuelUsed;
     distance=miles;
   }

  odometer=odometer+distance; //adjusts the odometer by the amount of miles driven

  return distance;
 }
/**
 *   This method ouputs the odometer reading, the fuel level,and the fuel Efficiency
 *   @return The odometer, fuelLevel & fuelEfficiency
 */

 public String toString(){
   return "This is the odometer reading: " + odometer + "the fuel level: " + fuelLevel + " the fuel Efficiency:: " +fuelEfficiency ;
 }
}