package javabasico;
import java.util.*;

/**
 * Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.
 *
 * Input Format
 *
 * The first line contains a single string denoting .
 * The second line contains two space-separated integers denoting the respective values of  and .
 *
 * Constraints
 *
 * String  consists of English alphabetic letters (i.e., ) only.
 */

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        for (int i = start; i <= end - 1; i++) {
            System.out.print(S.charAt(i));
        }
    }
}
