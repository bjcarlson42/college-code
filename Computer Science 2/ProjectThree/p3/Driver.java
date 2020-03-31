import java.io.*;
import java.util.*;

/**
 * Class Driver invokes the methods in class CTRivers.
 *
 * @author Benjamin Carlson
 * @version March 21, 2020
 */
public class Driver
{
    public static void main(String [] args) throws IOException 
    {
        River[] riverList = new River[100];
        String name;
        int length;
        int counter = 0;
        Scanner fileScan = new Scanner (new File("input.txt"));
        CTRivers obj = new CTRivers();
        
        while(fileScan.hasNext())
        {
            name = fileScan.next();
            length = fileScan.nextInt();
            River oneRiver = new River(name, length);
            riverList[counter] = oneRiver;
            counter++;
        }
        
        // Method 1
        System.out.println("List of Rivers:");
        obj.printListRec(riverList, counter);
        
        // Method 2
        // successful
        String river = "Connecticut";
        System.out.println("\nSearching for: " + river);
        System.out.println(obj.linearSearch(riverList, counter, river));
        
        // unsuccessful
        river = "Rhode Island";
        System.out.println("\nSearching for: " + river);
        System.out.println(obj.linearSearch(riverList, counter, river));
        
        // Method 3
        int min = 20;
        int max = 50;
        System.out.println("\nList of rivers between " + min + " and " + max + ":");
        for(River r : obj.searchRange(riverList, counter, min, max))
        {
            System.out.println(r);
        }
        
        // Method 4
        System.out.println("\nRivers sorted by name:");
        obj.sortByNameRec(riverList, counter);
        obj.printListRec(riverList, counter);
        
        // Method 5
        String riverName = "Pawcatuck";
        String riverNameUnsuccessful = "Rhode Island River";
        int first = 0;
        int last = counter;
        System.out.println("\nSearch for the river named " + riverName + ":");
        System.out.print(obj.binarySearchRec(riverList, first, last, riverName));
        
        System.out.println("\nSearch for the river named " + riverNameUnsuccessful + ":");
        System.out.print(obj.binarySearchRec(riverList, first, last, riverNameUnsuccessful));
    }
}
