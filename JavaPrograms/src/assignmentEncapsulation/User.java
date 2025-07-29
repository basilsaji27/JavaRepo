package assignmentEncapsulation;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ATM PIN: ");
        int pin = scanner.nextInt();
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        Bank bank = new Bank();
        bank.setPinNo(pin);
        bank.withdrawAmount(amount);
        scanner.close();
    }
}	