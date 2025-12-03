import java.util.*;
import java.io.*;

public class AllDigitsCount {
    public int allDigitsCount(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;   // remove last digit
            count++;      // increase count
        }
        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        AllDigitsCount obj = new AllDigitsCount();
        int result = obj.allDigitsCount(n);
        System.out.println(result);
    }
}

