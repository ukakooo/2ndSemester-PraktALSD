import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        
        System.out.print("Please input your NIM: ");
        long nim = sigmaSkibidi.nextLong();
        nim = nim % 100;

        int n = (int) nim;
        
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);
        
        for (int i = 0; i <= n; i++) {
            if (i == 6 || i == 10) {
                System.out.print("");
            } else {
                if (i == 0) {
                    System.out.print("");
                }
                else if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                else if (i % 2 != 0 ) {
                    System.out.print("* ");
                }
            }
        }
    }
}
