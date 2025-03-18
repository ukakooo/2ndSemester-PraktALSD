package Exp1;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sigmaSkibidi.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("The factorial of " + num + " using BF: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " using DC: " + fk.factorialDC(num));
    }
}
