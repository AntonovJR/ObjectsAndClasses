
import java.util.Random;
import java.util.Scanner;

public class AdvMessage {
    public static class Messages {
        private final String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        private final String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles.", "I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        private final String[] authors = {"Diana", "Petya", "Stella", "Elena,", "Katya,", "Iva", "Annie", "Eva"};
        private final String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna,", "Ruse"};

        public String toString() {
            Random randomNum = new Random();
            return String.format("%s %s %s – %s", phrases[randomNum.nextInt(phrases.length)], events[randomNum.nextInt(events.length)],
                    authors[randomNum.nextInt(authors.length)], city[randomNum.nextInt(city.length)]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Messages messages = new Messages();
        for (int i = 0; i < n; i++) {
            System.out.println(messages.toString());
        }
    }
}

