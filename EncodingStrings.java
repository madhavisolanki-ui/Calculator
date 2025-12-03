import java.util.*;
import java.io.*;
public class EncodingStrings {

    // Function to split string into FRONT, MIDDLE, END
    public static String[] splitThree(String s) {
        int n = s.length();
        int part = n / 3;
        int rem = n % 3;
        int f = part;       // front size
        int m = part;       // middle size
        int e = part;       // end size
        if (rem == 1) {
            m++;
        }
        // If remainder = 2 → front +1, end +1
        else if (rem == 2) {
            f++;
            e++;
        }
        String front = s.substring(0, f);
        String middle = s.substring(f, f + m);
        String end = s.substring(f + m);
        return new String[]{front, middle, end};
    }

    // Toggle case for Output3
    public static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input1:");
        String s1 = sc.nextLine();
        System.out.println("Enter Input2:");
        String s2 = sc.nextLine();
        System.out.println("Enter Input3:");
        String s3 = sc.nextLine();

        // Step 1: Split all into 3 parts
        String[] A = splitThree(s1);
        String[] B = splitThree(s2);
        String[] C = splitThree(s3);

        // Step 2: Form Output strings
        String out1 = A[0] + B[0] + C[0];   // FRONTs
        String out2 = A[1] + B[1] + C[1];   // MIDDLEs
        String out3 = A[2] + B[2] + C[2];   // ENDs

        // Step 3: Toggle case only for Output3
        out3 = toggleCase(out3);

        // Final Output
        System.out.println("Output1 = " + out1);
        System.out.println("Output2 = " + out2);
        System.out.println("Output3 = " + out3);
    }
}
