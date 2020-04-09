
/**
 * Class Student defines a student object.
 *
 * @author Benjamin Carlson
 * @version April 8th, 2020
 */
public class Student
{
    private String lastName;
    private double gpa;
    private int age;
    
    public Student(String lastName, double gpa, int age) 
    {
        this.lastName = lastName;
        this.gpa = gpa;
        this.age = age;
    }
    
    public String toString()
    {
        return "lastName: " + lastName + "\tgpa: " + gpa + "\tage: " + age;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public int getAge()
    {
        return age;
    }
}
