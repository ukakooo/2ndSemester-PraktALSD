import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[10];
        Scanner sigmaSkibidi = new Scanner(System.in);

        for(int i = 0; i < rectangleArray.length; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input length: ");
            rectangleArray[i].length = sigmaSkibidi.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sigmaSkibidi.nextInt();
        }
        for (int i = 0; i < rectangleArray.length; i++) {
         System.out.println("Rectangle " + i);
         System.out.println("Width " + rectangleArray[i].width + ", length: " + rectangleArray[i].length);       
        }
    }
}
