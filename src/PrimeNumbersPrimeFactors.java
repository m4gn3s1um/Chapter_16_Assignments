import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumbersPrimeFactors {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Set<Integer> primeFactors(int n) {
        Set<Integer> factors = new HashSet<>();
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                factors.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int num = input.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
            Set<Integer> factors = primeFactors(num);
            System.out.print("The prime factors of " + num + " are: ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
        }
    }
}