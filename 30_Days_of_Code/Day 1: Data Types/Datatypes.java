import java.util.*;

public class Datatypes {	
    public static void main(String[] args) {
        int a = 4;
        double b = 4.0;
        String c = "HackerRank ";
		
        //get the input from user
        Scanner scan = new Scanner(System.in);
        var a1 = scan.nextInt();
        double b1 = scan.nextDouble();
        scan.nextLine();
        String c1 = scan.nextLine();
        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

            //print 
            System.out.println(a+a1);
            System.out.println(b+b1);
            System.out.println(c+c1);

        scan.close();
    }
}