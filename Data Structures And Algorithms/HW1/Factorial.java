public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) 
            throw new IllegalArgumentException("n can't be less than 0!");
        else if (n == 0)
            return 1;
        else 
            return n * factorial(n-1);
    }
}
