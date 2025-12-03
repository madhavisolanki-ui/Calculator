import java.util.*;
import java.io.*;

public class DecreasingSequence {
    public static int[] findDecreasingSequences(int[] arr, int n) {
        int count = 0;
        int maxLen = 0;
        int currLen = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                currLen++;
            } else {
                if (currLen > 1) {
                    count++;
                    maxLen = Math.max(maxLen, currLen);
                }
                currLen = 1;
            }
        }

        if (currLen > 1) {
            count++;
            maxLen = Math.max(maxLen, currLen);
        }

        return new int[]{count, maxLen};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = findDecreasingSequences(arr, n);
        System.out.println("output1 = " + result[0]);
        System.out.println("output2 = " + result[1]);
    }
}
