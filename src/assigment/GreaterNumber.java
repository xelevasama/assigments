package assigment;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int a = sc.nextInt();
        System.out.print("Number 2: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("The greater number is: " + a);
        } else if (b > a) {
            System.out.println("The greater number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }
}
