package base;
import java.util.Scanner;
public class App {
    static Scanner inp = new Scanner(System.in);

    public static void main(){
        App myApp = new App();

        String name = myApp.readIn();
        int size = myApp.findSize(name);
        myApp.concatenate(size, name);
    }

    public String readIn() {
        System.out.print("What is the input string? ");
        String str = inp.nextLine();
        while (str.equals(""))
        {
            System.out.print("Please input a valid string.");
            str = inp.nextLine();
        }
        return str;
    }
    public int findSize(String str){
        return str.length();
    }
    public void concatenate(int l, String s) {
        String out = s + " has " + l + " characters.";
        System.out.println(out);
    }
}
