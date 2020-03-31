/**
 * This program computes the factorial of number N up to N = 50.
 *
 * @author Benjamin Carlson
 * @version 1/29/20
 */

public class Fact {
    public static void main(String[] args) {

        System.out.println(" N    N!\n---  ---");

        int num = 0;
        int fact, counter;

        while (num <= 50) {
            counter = num;
            fact = 1;

            while (counter > 0) {
                fact = fact * (counter);
                counter--;
            }

            System.out.println(num + "    " + fact);
            num++;
        }
    }
}