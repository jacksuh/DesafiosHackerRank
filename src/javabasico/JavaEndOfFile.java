package javabasico;
import java.util.*;

/**
 * Input Format
 *
 * Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
 */

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String a;
        int i=1;
        while(in.hasNext())
        {
            a=in.nextLine();
            System.out.println(i+" "+a);
            i++;
        }
    }
}
