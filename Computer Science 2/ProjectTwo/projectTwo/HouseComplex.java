
/**
 * Class HouseComplex holds methods for a list of houses built on
 * the same street.
 *
 * @author Benjamin Carlson
 * @version Feb 25, 2020
 */

import java.io.*;  
import java.util.*;

public class HouseComplex
{
    // returns String of all houses in the list
    public String toString(House[] list, int n) {
        if (n == 1)
            return list[n-1].toString();
        else {
            return toString(list, n - 1) + list[n-1].toString();
        }
    }
    
    // prints all new houses in the list
    public void printNewHouses(House[] list, int n) {
        if (n > 0) {
            printNewHouses(list, n - 1);
            if (list[n-1].isNew())
                System.out.println(list[n-1] + "\t");
        }
    }
    
    // returns all the expensive houses in the list
    int count = 0;
    public int countExpensive(House[] list, int n)  {
        if (n > 0) {
            countExpensive(list, n - 1);
            if (list[n-1].getCost() > 300) {
                count++;
            }
        }
        return count;
    }
    
    //returns the cheapest house in the list
    public House cheapestHouse(House[] list, int n) {
        if (n == 1)
            return list[0];
        else {
            House temp = cheapestHouse(list, n - 1);
            if (temp.getCost() < list[n - 1].getCost())
                return temp;
            else
                return list[n-1];
        }
    }
    
    // returns ArrayList<House> of houses that have
    // between 1500 and 2500 square feet (including the limits )
    ArrayList<House> newList = new ArrayList<House>();
    public ArrayList<House> moderateSize(House[] list, int n) {
        if (n > 0) {
            moderateSize(list, n - 1);
            if (list[n-1].getSqFeet() >= 1500 && list[n-1].getSqFeet() <= 2500)
                newList.add(list[n-1]);
        }
        return newList;
    }
}
