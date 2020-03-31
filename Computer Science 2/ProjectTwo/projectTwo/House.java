
/**
 * Class House describes one house object and holds variables
 * and methods for this program. 
 *
 * @author Benjamin Carlson
 * @version Feb 25, 2020
 */

public class House
{
    private int houseNumber, bedrooms, sqFeet, year, cost;
    
    public House(int houseNumber, int bedrooms, int sqFeet, int year, int cost) {
        this.houseNumber = houseNumber;
        this.bedrooms = bedrooms;
        this.sqFeet = sqFeet;
        this.year = year;
        this.cost = cost;
    }
    
    // getter method for cost
    public int getCost() {
        return cost;
    }
    
    // getter method for sqFeet
    public int getSqFeet() {
         return sqFeet;
    }
    
    // returns if the house is new (built in 2015 - now)
    public boolean isNew() {
        return year >= 2015;
    }
    
    // toString() returns a string with all the house's data
    public String toString() {
        return "\nhouseNumber: " + houseNumber + "\tbedrooms: " + bedrooms + "\tsqFeet: " + sqFeet + "\tyear: " + year + "\tcost: " + cost;
    }
}
