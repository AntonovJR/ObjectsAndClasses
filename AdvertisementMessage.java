
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        String[] phrases = {"Excellent product.","Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.","I have succeeded with this product.","Makes miracles.", "I am happy of the results!","I cannot believe but now I feel awesome.","Try it yourself, I am very satisfied.","I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella","Elena,","Katya,","Iva","Annie","Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv","Varna,","Ruse"};
        Scanner scanner = new Scanner(System.in);
        Random number = new Random();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            int x = number.nextInt(phrases.length);
            int y = number.nextInt(events.length);
            int z = number.nextInt(authors.length);
            int v = number.nextInt(city.length);
            System.out.printf("%s %s %s - %s%n",phrases[x],events[y],authors[z],city[v]);
        }




    }
}
