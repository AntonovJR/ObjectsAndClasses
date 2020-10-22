import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Random randomGenerator = new Random();
        for (int i = 0; i <= input.length ; i++) {
            int x = randomGenerator.nextInt(input.length);
            int y = randomGenerator.nextInt(input.length);
            String oldWords = input[x];
            input[x]= input[y];
            input[y]= oldWords;
        }
        for (String output:input) {
            System.out.println(output);

        }

    }
}
