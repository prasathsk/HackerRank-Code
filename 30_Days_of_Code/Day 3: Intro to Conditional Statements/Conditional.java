//Day 3 code: Intro to Conditional Statements

import java.util.*;

public class Conditional {
    public static void main(String args[]) {

        // get the Input from User
        Scanner scan = new Scanner(System.in);

        // get the value to scan
        int num = scan.nextInt();

        int Check = num % 2;

        // Condition
        if (num > 20 && Check == 0) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

        // close the scan
        scan.close();
    }
}