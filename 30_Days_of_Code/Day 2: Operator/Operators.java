import java.io.*;
import java.util.*;
import java.math.*;

public class OPerators {
    public static void main(String args[]) {

        // get the input
        Scanner scan = new Scanner(System.in);
        double meal_cost = scan.nextDouble();
        int tip_percent = scan.nextInt();
        int tax_percent = scan.nextInt();
        OPerators.add(meal_cost, tip_percent, tax_percent);
    }

    // subclass add
    static void add(double meal_cost, int tip_percent, int tax_percent) {
        int pen = 100;
        double cost = meal_cost * tip_percent / pen;
        double price = tax_percent * tip_percent / pen;
        System.out.println((int) Math.round(cost + price + meal_cost));
    }
}