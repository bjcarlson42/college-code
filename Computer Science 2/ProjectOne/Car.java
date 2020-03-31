
/**
 * Class Car describes one car object and holds variables
 * and methods for this program.
 *
 * @author Benjamin Carlson
 * @version 1/29/20
 */

public class Car
{
    private String vin, model;
    public String make;
    private double cost;
    private int year;

    public Car(String vin, String make, String model, double cost, int year) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.cost = cost;
        this.year = year;
    }
    
    // getModel() returns the cars model
    public String getModel() {
        return model;
    }
    
    // getYear() returns the cars year
    public int getYear() {
        return year;
    }
    
    // isExpensive() returns true if the cars value is > 30000 
    // and false otherwise
    public boolean isExpensive() {
        return cost > 30000;
    }
    
    // isAntique() returns true if the cars year is before 1968
    // and false otherwise
    public boolean isAntique() {
        return year < 1968;
    }
    
    // toString() returns a string with all the cars data
    public String toString() {
        return "vin: " + vin + "\tmake: " + make + "\tmodel: " + model + "\tcost: " + cost + "\tyear: " + year + "\n";
    }
}
