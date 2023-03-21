package javabasico;

import java.awt.print.Book;
import java.util.Scanner;

public class JavaObjectOrientedProgramming {

    abstract class Book{
        String title;
        abstract void setTitle(String s);
        String getTitle(){
            return title;
        }

    }

    class MyBook extends Book
    {
        @Override void setTitle
                (String s) { title = s; }
    }

    public void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}
