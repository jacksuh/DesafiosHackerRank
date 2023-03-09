package javabasico;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        int n1=a.length();
        int n2=b.length();
        if(n1!=n2)
        {
            return false;
        }
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        if(java.util.Arrays.equals(arr1,arr2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
