/* 
* This program prompts the user for a number n, and computes 
* the harmonic sum 4 different ways
*
* @author Benjamin Carlson
* @version 2/11/20
*/

import java.io.*;
import java.util.*;

public class HarmonicNumbers{
    public static void main (String [] args) throws IOException {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter an integer n:");
        int n = myScan.nextInt();
        myScan.close();

        float sumFloatUp = 0;
        for(int i = 1; i <= n; i++) {
            sumFloatUp += 1/(float)i;
        }

        float sumFloatDown = 0;
        for(int i = n; i > 0; i--) {
            sumFloatDown += 1/(float)i;
        }

        double sumDoubleUp = 0.0;
        for (int i = 1; i <= n; i++) {
            sumDoubleUp += 1/(double)i;
        }

        double sumDoubleDown = 0.0;
        for (int i = n; i > 0; i--) {
            sumDoubleDown += 1 /(double)i;
        }

        System.out.println("Upper Limit --> " + n);
        System.out.println("upward sum (float): " + sumFloatUp);
        System.out.println("downward sum (float): " + sumFloatDown);
        System.out.println("upward sum (double): " + sumDoubleUp);
        System.out.println("downward sum (double): " + sumDoubleDown);
    }
}