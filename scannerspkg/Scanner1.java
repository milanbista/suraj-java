package scannerspkg;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        //Scanner utility class
        // to take input
        //scanner takes input from various sources
        // sources: keyboard, file, Strings, Internet call

//        Scanner s = new Scanner("Hi 10 how \n are you?");
//
//        System.out.println(s.hasNext());
//        System.out.println(s.nextLine());
//        System.out.println(s.hasNext());

        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter name: ");
        String name = scan.next();
        System.out.println("welcome " + name);

    }
}
