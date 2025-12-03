import java.io.*;
import java.util.*;

public class CreatePIN {
    public static int createPIN(int input1, int input2, int input3) {
        int a1 = input1 % 10;             // units
        int a2 = (input1 / 10) % 10;      // tens
        int a3 = (input1 / 100) % 10;     // hundreds

        int b1 = input2 % 10;
        int b2 = (input2 / 10) % 10;
        int b3 = (input2 / 100) % 10;

        int c1 = input3 % 10;
        int c2 = (input3 / 10) % 10;
        int c3 = (input3 / 100) % 10;
        // ones position → least of units
        int ones = Math.min(a1, Math.min(b1, c1));
        // tens position → least of tens
        int tens = Math.min(a2, Math.min(b2, c2));
        // hundreds position → least of hundreds
        int hundreds = Math.min(a3, Math.min(b3, c3));
        // thousands position → maximum of all digits
        int[] arr = {a1, a2, a3, b1, b2, b3, c1, c2, c3};
        int maxDigit = 0;
        for (int d : arr) {
            if (d > maxDigit)
                maxDigit = d;
        }
        // form the final PIN
        int pin = maxDigit * 1000 + hundreds * 100 + tens * 10 + ones;
        return pin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int pin = createPIN(input1, input2, input3);
        System.out.println(pin);
    }
}
