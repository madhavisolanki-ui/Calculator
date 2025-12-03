import java.util.*;
import java.io.*;
public class AdditionUsingString{
    public static String addNumbers(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            int sum = d1 + d2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number string:");
        String s1 = sc.nextLine();
        System.out.println("Enter second number string:");
        String s2 = sc.nextLine();
        String ans = addNumbers(s1, s2);
        System.out.println("Result = " + ans);
    }
}
