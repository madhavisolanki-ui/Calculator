import java.util.*;
import java.io.*;

public class Count_primes_in_a_range{
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        // check up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Function to count primes in range [L, R]
    public static int countPrimes(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int L = sc.nextInt();
        System.out.print("Enter end of range: ");
        int R = sc.nextInt();
        int result = countPrimes(L, R);
        System.out.println("Number of primes in the range = " + result);
    }
}
