package Exp3;
import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        System.out.print("Input element number: ");
        int element = sigmaSkibidi.nextInt();

        Sum sm = new Sum(element);
        for(int i = 0; i < element; i++) {
            System.out.print("Input profit #" + (i + 1) + " : ");
            sm.profits[i] = sigmaSkibidi.nextDouble();
        }

        System.out.println("Total profit using BF: " + sm.totalBF());
        System.out.println("Profit total using DC: " + sm.totalDC(sm.profits, 0, element-1));

    }
}
