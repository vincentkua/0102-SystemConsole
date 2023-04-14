package sample;

import java.io.Console;

// type class to generate
public class readLineSample {

    // type main to generate
    public static void main(String[] args) {
        Console cons = System.console();
        String input1 = cons.readLine("Type Something Here :");
        System.out.println("Your input :" + input1);
    }

}
