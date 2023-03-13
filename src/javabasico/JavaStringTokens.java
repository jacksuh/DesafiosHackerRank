package javabasico;

import java.util.Scanner;

public class JavaStringTokens {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.isEmpty()){
            System.out.println("0");
            return;
        }

        String[] newData = s.split("[ ,!?._'@]+");

        System.out.println(newData.length);

        for (String data : newData) {
            System.out.println(data);
        }
        scan.close();
    }
}

