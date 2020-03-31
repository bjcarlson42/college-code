
/**
 * Class River describes river's name and length as well as provides
 * getter and setter methods.
 *
 * @author Benjamin Carlson
 * @version March 21, 2020
 */
public class River
{
    private String name;
    private int length;
    
    public River(String name, int length)
    {
        this.name = name;
        this.length = length;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public String toString()
    {
        return "Name: " + name + "\tLength: " + length;
    }
}
