import java.io.*;  
import java.util.*;
    
/**
 * Class CTRivers describes a collection of CT rivers.
 *
 * @author Benjamin Carlson
 * @version March 21, 2020
 */
    public class CTRivers
    {
    // Prints all rivers recursively in the same order as they were in the list
    // List may or may not be empty
    void printListRec(River[] list, int n)
    {
        if (n > 0)
        {
            printListRec(list, n - 1);
            System.out.println(list[n-1]);
        }
    }
    
    // Returns index for the river object with given name.  Returns -1 for unsuccessful search. List can 
    // be empy or not.
    int linearSearch(River[] list, int n,  String name) 
    {
        int index = 0;
        boolean found = false;
        
        while (!found && index < n)
        {
            if(list[index].getName().equals(name))
                found = true;
            else
                index++;
        }
        
        if (found)
            return index;
         else
            return -1;
    }
    
    // Returns  ArrayList of rivers with length between min and max inclusive. Returns an empty 
    // Arraylist<River> if no such river was found. List can be empy or not.
    ArrayList <River> searchRange(River[] list, int n, int min, int max)
    {
        ArrayList<River> riverList = new ArrayList<River>();
        if(n > 0)
        {
            for(int i = 0; i < n; i++)
            {
             if (list[i].getLength() >= min && list[i].getLength() <= max)
                riverList.add(list[i]);
            }
        }
        return riverList;
    }
    
    // Sorts list of rivers by selection sort recursively (Compare river by their names.) List can be empy or not.
    public void sortByNameRec(River[] list, int n)
    {
       if(n > 1)
       {
           River temp;
           for (int i = 0; i < n-1; i++)
           {
               if (list[i].getName().compareTo(list[i+1].getName()) > 0) 
                {
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
           }
           sortByNameRec(list, n-1);
        }
    }
   
    // PRECONDITION:  Method assumes that input  list is sorted by names. First and last are indices of the first 
    // and last character of the current substring.  Returns index of River object with given name or returns -1 
    // if none of the rivers has that name. List can be empy or not.
    int binarySearchRec(River[] list, int first, int last, String name)
    {
        int mid;
        if(first > last)
            return -1;
        else
        {
            mid = (first+last)/2;
            if(list[mid].getName().equals(name))
                return mid;
            else if(list[mid].getName().compareTo(name) > 0)
                return binarySearchRec(list, first, mid-1, name); // name on left. call again and search left side.
            else
                return binarySearchRec(list, mid+1, last, name); // name on right. call again and search right side.
        }
    }
}