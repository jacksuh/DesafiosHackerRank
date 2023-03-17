package javabasico;
import java.util.*;
import java.math.BigInteger;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger c =  a;
        BigInteger d =  b;

        System.out.println(c.add(d));
        System.out.println(c.multiply(d));
        sc.close();
    }
}
