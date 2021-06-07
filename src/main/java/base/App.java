/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        String name = myApp.readIn();
        int size = myApp.findSize(name);
        myApp.concatenate(size, name);
    }

    private String readIn() {
        System.out.print("What is the input string? ");
        String str = inp.nextLine();
        while (str.equals(""))
        {
            System.out.print("Please input a valid string: ");
            str = inp.nextLine();
        }
        return str;
    }
    private int findSize(String str){
        return str.length();
    }
    private void concatenate(int l, String s) {
        String out = s + " has " + l + " characters.";
        System.out.println(out);
    }
}
