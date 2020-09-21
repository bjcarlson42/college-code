import java.io.FileWriter;
import java.io.IOException;

public class GenerateRandInt {
    public static void main(String[] args) throws IOException {
        generateNumbers();
    }

    public static void generateNumbers() throws IOException {

        FileWriter file = new FileWriter("5.txt");

        for (int i = 1; i <= 2000; i++) {
            file.write(getRandomNumber(1, 2000) + " ");
        }

        // for (int i = 1; i <= 2000; i++) {
        //     file.write(i + " ");
        // }

        file.close();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
