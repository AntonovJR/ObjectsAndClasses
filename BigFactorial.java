import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    static void Circle(){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger sum =  findFactorial(n);
        System.out.println(sum);
    }

    private static BigInteger findFactorial(int n) {
        BigInteger result = BigInteger.valueOf(n);
        for (int i = n-1; i >=1 ; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    }

