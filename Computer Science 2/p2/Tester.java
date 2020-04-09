
/**
 * Class tester tests the methods in the House and HouseComplex classes
 *
 * @author Benjamin Carlson
 * @version Feb 25, 2020
 */

import java.io.*;  
import java.util.*;

public class Tester
{
    public static void main (String [] args) throws IOException {
        House[] houseList = new House[70];
        int houseNumber, bedrooms, sqFeet, year, cost;
        Scanner fileScan = new Scanner (new File("inData.txt"));
        House oneHouse;
        int countOfHouses = 0;
        
        HouseComplex obj = new HouseComplex();
        
        while(fileScan.hasNext()) {
            houseNumber = fileScan.nextInt();
            bedrooms = fileScan.nextInt();
            sqFeet = fileScan.nextInt();
            year = fileScan.nextInt();
            cost = fileScan.nextInt();
            oneHouse = new House(houseNumber, bedrooms, sqFeet, year, cost);
            houseList[countOfHouses] = oneHouse;
            countOfHouses++;
        }
        
        // Method 1
        System.out.println("List of houses:"); 
        System.out.println(obj.toString(houseList, countOfHouses));
        
        // Method 2
        System.out.println("\nList of new houses:");
        obj.printNewHouses(houseList, countOfHouses);
        
        // Method 3
        System.out.println("\nNumber of expensive houses in list:"); 
        System.out.println(obj.countExpensive(houseList, countOfHouses));
        
        // Method 4
        System.out.println("\nCheapest house in the list:"); 
        System.out.println(obj.cheapestHouse(houseList, countOfHouses));
        
        // Method 5
        System.out.println("\nModerate size houses:"); 
        System.out.println(obj.moderateSize(houseList, countOfHouses));
    }
}
