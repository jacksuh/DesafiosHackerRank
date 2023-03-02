package javabasico;
import java.util.*;

/**
 * The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
 *
 * Given two strings of lowercase English letters,  and , perform the following operations:
 *
 * Sum the lengths of  and .
 * Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
 * Capitalize the first letter in  and  and print them on a single line, separated by a space.
 * Input Format
 *
 * The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
 */


public class JavaStringsIntroduction {

    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String A=sc.next();
                String B=sc.next();
                /* Enter your code here. Print output to STDOUT. */
                    System.out.println(A.length()+B.length());
                    sc.close();
                        System.out.println(A.charAt(0)>B.charAt(0)?"Yes":"No");
                            A=A.substring(0,1).toUpperCase()+A.substring(1)+" ";
                                B=B.substring(0,1).toUpperCase()+B.substring(1);
                                    System.out.println(A+B);

    }
}
