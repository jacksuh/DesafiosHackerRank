package javabasico;
import java.util.*;

/**
 * Input Format
 *
 * There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
 *
 * Constraints
 *
 * Output Format
 *
 * If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 */

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        if (b>0 && h>0) {
            System.out.println(h*b);
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
