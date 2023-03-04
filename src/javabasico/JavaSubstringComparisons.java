package javabasico;
import java.util.Scanner;

/**
 * We define the following terms:
 *
 * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
 * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 *
 * A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
 * Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
 */

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }

    private static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - k + 1; i++) {
            String substring = s.substring(i, i + k);
            if (substring.compareTo(largest) > 0)
                largest = substring;
            if (substring.compareTo(smallest) < 0)
                smallest = substring;
        }

        return smallest + "\n" + largest;
    }

}


