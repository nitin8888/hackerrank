package thirtydaysofcode;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.math.BigDecimal.valueOf;

public class Day2Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // mealCost + 0.2 tim + 0.8tax
        // round to full amount
        BigDecimal percentage = new BigDecimal("0.01");
        BigDecimal mealCost = valueOf(meal_cost);
        BigDecimal tip = mealCost.multiply(valueOf(tip_percent)).multiply(percentage);
        BigDecimal tax = mealCost.multiply(valueOf(tax_percent)).multiply(percentage);
        BigDecimal total = mealCost.add(tip).add(tax).setScale(0, RoundingMode.HALF_UP);
        System.out.println(total);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}