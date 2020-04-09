    
/**
 * Class LLStudent defines methods on Student Class.
 *
 * @author Benjamin Carlson
 * @version April 8th, 2020
 */
 public class LLStudent
 {
     private Node list;
        
     public LLStudent()
     {
         list = null;
     }
        
     public void addFront(Student s)
     {
         Node node = new Node(s);
         node.next = list;
         list = node;
     }
        
     public void printLinkedList()
     {
         Node curr = list;
         while(curr != null)
         {
             System.out.println(curr.data);
             curr = curr.next;
         }
     }
        
     public Node getList()
     {
         return list;
     }
        
     public Student worstStudent()
     {
         Node curr = list;
         Student lowest = curr.data;
         while(curr != null)
         {
             if(curr.data.getGpa() < lowest.getGpa())
                 lowest = curr.data;
             curr = curr.next;
         }
         return lowest;
     }
        
     public boolean isSortedByGpa()
     {
         Node curr = list;
         double gpa = curr.data.getGpa();
         if (list == null || list.next == null) // if list has 0 or 1 element, it's sorted
             return true;
         while(curr.next != null)
         {
             if (list.data.getGpa() > list.next.data.getGpa())
                 return false;
             curr = curr.next;
         }
         return true;
     }
        
     public boolean isSortedByAgeRec(Node first) 
     {
        if(first == null || first.next == null)
            return true;
        return first.data.getAge() <= first.next.data.getAge() && isSortedByAgeRec(first.next);
     }
        
     public Student bestStudentRec(Node first)
     {
        if(first.next == null || first == null)
            return first.data;
        else
           {
              double temp1 = first.data.getGpa();
              double temp2 = bestStudentRec(first.next).getGpa();
          
              if(temp1>temp2)
                  return first.data;
              else
                  return bestStudentRec(first.next);
            }
     }
    
     private class Node
     {
         public Student data;
         public Node next;
        
         public Node(Student s)
         {
         data = s;
         next = null;
         }
     }   
}
