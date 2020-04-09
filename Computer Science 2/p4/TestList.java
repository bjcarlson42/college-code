
/**
 * Class TestList invokes methods from LLStudent.
 *
 * @author Benjamin Carlson
 * @version April 8th, 2020
 */
public class TestList
{
    public static void main (String [] args )
    {
        Student s1 = new Student("Adams", 2.2, 26);
        Student s2 = new Student("Jones", 3.0, 29);
        Student s3 = new Student("Marcus", 3.2, 53);
        Student s4 = new Student("Smith", 3.3, 20);
        Student s5 = new Student("Zee", 3.6, 36);
        
        LLStudent list1 = new LLStudent();
        LLStudent list2 = new LLStudent();
        
        list1.addFront(s5);
        list1.addFront(s4);
        list1.addFront(s3);
        list1.addFront(s2);
        list1.addFront(s1);
        
        list2.addFront(s3);
        list2.addFront(s5);
        list2.addFront(s2);
        list2.addFront(s1);
        list2.addFront(s4);
        
        System.out.println("Printing list1:");
        list1.printLinkedList();
        System.out.println("\nPrinting list2:");
        list2.printLinkedList();

        System.out.println("\nPrinting worst student from list1: " + list1.worstStudent());
        System.out.println("Printing worst student from list2: " + list2.worstStudent());
        
        System.out.println("\nInvoking list1.isSortedByGpa(): " + list1.isSortedByGpa());
        System.out.println("Invoking list2.isSortedByGpa(): " + list2.isSortedByGpa());
        
        System.out.println("\nInvoking list1.isSortedByAgeRec(Node first): " + list1.isSortedByAgeRec(list1.getList()));
        System.out.println("Invoking list2.isSortedByAgeRec(Node first): " + list2.isSortedByAgeRec(list2.getList()));
        
        System.out.print("\nExtra credit...");
        System.out.println("\nInvoking list1.bestStudentRec(Node first): " + list1.bestStudentRec(list1.getList()));
        System.out.println("Invoking list2.bestStudentRec(Node first): " + list2.bestStudentRec(list2.getList()));
    }
}
