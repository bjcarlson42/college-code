
/**
 * TestCarList tests the methods in the Car and CarList classes.
 *
 * @author Benjamin Carlson
 * @version 2/4/20
 */

import java.io.*;  

public class TestCarList
{
    public static void main ( String [] args ) throws IOException {
        
        CarList obj = new CarList();
        
        // Method 1
        System.out.println("\nList of cars:"); 
        obj.printList();
        
        // Method 2
        obj.printExpensiveCars();
        
        // Method 3
        System.out.println("\nOldest car:\n" + obj.oldestCar());
        
        // Method 4
        if(obj.countCarsWithMake("Toyota") == 0) {
            System.out.println("There are no cars with this make.");
        } else {
            System.out.println("There are/is " + obj.countCarsWithMake("Toyota") + " car(s) with this make.");
        }
        
        // Method 5
        System.out.println("\nBoth expensive and Antique:\n" + obj.antiqueExpensiveCarList());
    }
}
