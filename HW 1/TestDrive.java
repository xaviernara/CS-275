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
    double newFuelEfficiency;
    double newFuelLevel;
    double newDistance;
    //Car vehicle = new Car(newFuelEfficiency);
    
       int i=1;
       int x=1;
       while (i==1){  
         
       Car vehicle = new Car(newFuelEfficiency);
       if(x == 1)
       {
         System.out.println("Please enter a fuel efficiency: ");
         newFuelEfficiency = scanner.nextDouble();
         vehicle.Car(newFuelEfficiency);
          
         if(newFuelEfficiency == 0){
           System.out.println("Thanks for driving!!!");
           break;
           }
       }
         x = 1;
         System.out.println("Please enter an amount of fuel: ");
         newFuelLevel= scanner.nextDouble();
         vehicle.addFuel(newFuelLevel);

         if(vehicle.getFuelLevel()==0){
                //System.out.println("Please enter an amount of fuel: ");
                //newFuelLevel= scanner.nextDouble();
                //vehicle.addFuel(newFuelLevel);
                //continue;
                 
                /* System.out.println("Please enter a fuel efficiency: ");
                 newFuelEfficiency = scanner.nextDouble();
                 vehicle=new Car(newFuelEfficiency);*/           
                 continue;
                 }
         
         while( i == 1){
         System.out.println("Please enter a distance to travel: ");
         newDistance = scanner.nextDouble();
         vehicle.drive(newDistance);
         
         if(vehicle.getOdometer() == 0){
           x = 0; 
           continue;
             }

         }
         
         System.out.println("Distance you travelled: "+ vehicle.drive(newDistance));
         System.out.println("Current fuelLevel: " + vehicle.getFuelLevel());
         System.out.println("Current odometer: "+ vehicle.getOdometer());
       }
  }
}
         //Car vehicle=new Car(newFuelEfficiency);
         /*

         System.out.println("Please enter an amount of fuel: ");
         newFuelLevel= scanner.nextDouble();
         vehicle.addFuel(newFuelLevel);

         System.out.println("Please enter a distance to travel: ");
         newDistance= scanner.nextDouble();

         if(newDistance==0){
             //System.out.println("Distance to travel is zero. Thanks for driving");
             //break;
           System.out.println("Please enter an amount of fuel: ");
           newFuelLevel= scanner.nextDouble();
           vehicle.addFuel(newFuelLevel);

            }
         System.out.println("Distance you travelled: "+ vehicle.drive(newDistance));
         System.out.println("Current fuelLevel: " + vehicle.getFuelLevel());
         System.out.println("Current odometer: "+ vehicle.getOdometer());


         //Traveling While loop
           while (newFuelLevel>0){
              System.out.println("Please enter a distance to travel: ");
              newDistance= scanner.nextDouble();

              if(newDistance==0){
                System.out.println("Please enter an amount of fuel: ");
                newFuelLevel= scanner.nextDouble();
                vehicle.addFuel(newFuelLevel);

                //System.out.println("Distance to travel is zero. NO MORE DRIVING");
                //break;
                continue;
              }
              System.out.println("Distance you travelled: "+ vehicle.drive(newDistance));
              System.out.println("Current fuelLevel: " + vehicle.getFuelLevel());
              System.out.println("Current odometer: "+ vehicle.getOdometer());

              if(vehicle.getFuelLevel()==0){
                //System.out.println("Please enter an amount of fuel: ");
                //newFuelLevel= scanner.nextDouble();
                //vehicle.addFuel(newFuelLevel);
                //continue;
                 System.out.println("Please enter a fuel efficiency: ");
                 newFuelEfficiency = scanner.nextDouble();
                 vehicle=new Car(newFuelEfficiency);

                 System.out.println("Please enter an amount of fuel: ");
                 newFuelLevel= scanner.nextDouble();
                 vehicle.addFuel(newFuelLevel);
                 continue;
                 }
              /*if(vehicle.getFuelEfficiency() == 0 && vehicle.getFuelLevel()==0 ){
                  System.out.println("Please enter a fuel efficiency: ");
                  newFuelEfficiency = scanner.nextDouble();
                  vehicle=new Car(newFuelEfficiency);
                  continue;
                  }
                *//*
                if(newDistance==0 && vehicle.getFuelLevel()==0 ){
                  System.out.println("Please enter a fuel efficiency: ");
                  newFuelEfficiency = scanner.nextDouble();
                  vehicle=new Car(newFuelEfficiency);

                  System.out.println("Please enter an amount of fuel: ");
                  newFuelLevel= scanner.nextDouble();
                  vehicle.addFuel(newFuelLevel);
                  continue;
                }
               if(vehicle.getFuelEfficiency() == 0){
                 System.out.println("Thanks for driving!!!");
                 break;
               }


         }
         
       }
  }
}
*/