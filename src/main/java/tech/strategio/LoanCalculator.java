package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * You take a loan from a friend and need to calculate how much you will owe them after 3 months. 
     * You are going to pay them back 10% of the remaining loan amount each month. 
     * This program takes the loan amount as input, and
     * calculates and outputs the remaining amount after 3 months.
     * 
     * @param amount the initial loan amount that needs to be paid back
     * @return the remaining amount after 10% is paid each month for 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        for (int i = 1; i <= 3; i++) {
            amount -= amount / 10;
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
