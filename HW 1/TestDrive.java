/*
      Course: CS 27500
      Name: Xavier Richardon
      Email: xarichar@pnw.edu
      Assignment: 1
*/
import java.awt.*;
import java.util.*;

public class TestDrive {
  public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);
    double newFuelEfficiency=0;
    double newFuelLevel;
    double newDistance;
    
       int i=1;
       int x=1;
       while (i==1){  

       if(x == 1)
       {
         System.out.println("Please enter a fuel efficiency: ");
         newFuelEfficiency = scanner.nextDouble();
         //vehicle.Car(newFuelEfficiency);
          
         if(newFuelEfficiency == 0){
           System.out.println("Thanks for driving!!!");
           break;
         }
           
       }
       
         x = 1;
         System.out.println("Please enter an amount of fuel: ");
         
         newFuelLevel= scanner.nextDouble();
         if(newFuelLevel==0){   
                 continue;
                 }
         Car vehicle = new Car(newFuelEfficiency);//= 0 
         vehicle.addFuel(newFuelLevel);

         while( x == 1){
         System.out.println("Please enter a distance to travel: ");
         newDistance = scanner.nextDouble();
         vehicle.drive(newDistance);
         
         if(newDistance == 0){
           x = 0; 
           System.out.println("inside");
           continue;
             }
         System.out.println("Distance you travelled: "+ newDistance);
         System.out.println("Current fuelLevel: " + vehicle.getFuelLevel());
         System.out.println("Current odometer: "+ vehicle.getOdometer());
         }
       }
  }
}
