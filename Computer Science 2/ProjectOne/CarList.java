
/**
 * Class CarList reads car data from an input file inData.txt and 
 * declares 5 methods.
 *
 * @author Benjamin Carlson
 * @version 1/29/20
 */

import java.io.*;  
import java.util.*;

public class CarList {
    ArrayList<Car> list = new ArrayList<Car>(); 
    
    public CarList() throws IOException {
        Scanner fileScan;
        String vin, make, model;
        double cost;
        int year;
        
        Car oneCar;
        
        fileScan = new Scanner (new File("inData.txt"));
        while (fileScan.hasNext()) {
            vin = fileScan.next();
            make = fileScan.next();
            model = fileScan.next();
            cost = fileScan.nextDouble();
            year = fileScan.nextInt();
            oneCar = new Car(vin, make, model, cost, year);
            list.add(oneCar);
        } 
    }
    
    // printList() prints the complete data for each car
    public void printList() {
        System.out.println(list.toString());
    }
    
    // printExpensiveCars() prints a list of expensive cars
    public void printExpensiveCars() {
        System.out.println("List of expensive cars:");
        for (Car c : list) {
            if (c.isExpensive())
                System.out.println(c.toString());
        }
    }
    
    // oldestCar() prints the oldest car
    // In the case of multiple "oldest cars", it will return
    // the first such car
    public Car oldestCar() {
        Car oldest = list.get(0);
        for (Car c : list) {
            if(c.getYear() < oldest.getYear()) {
                oldest = c;
            }
        }
        return oldest;
    }
    
    // countCarsWithMake() returns the count of a specific make of car
    // which is passed in by the user
    public int countCarsWithMake(String make) {
        int count = 0;
        for(Car c : list) {
            if(c.make.equals(make)) {
                count++;
            }
        }
        return count;
    }
    
    // antiqueExpensiveCarList() returns an ArrayList of all the cars
    // which are both antique and expensive
    public ArrayList<Car> antiqueExpensiveCarList() {
        ArrayList<Car> newList = new ArrayList<Car>();
        for (Car c : list) {
            if(c.isAntique() && c.isExpensive()) {
                newList.add(c);
            }
        }
        return newList;
    }
}
