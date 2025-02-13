import java.util.Scanner;

class flowers {
    static int stocks[][] = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };
    static int prices[] = { 75000, 50000, 60000, 10000 };
    static int[] dead = {1, 2, 0, 5};
}

public class Function {
    static Scanner sigmaSkibidi = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        mainMenu(choice);
    }

    public static void mainMenu(int choice) {
        while (true) {
            System.out.println();
            System.out.println("========================================");
            System.out.println("======= Royal Garden Flower Shop =======");
            System.out.println("========================================");

            System.out.println("Welcome to the Royal Garden Flower Shop Management App!");
            System.out.println("Please select one of the option below:");
            System.out.println("1. Display the income of each branch if all branch are sold out");
            System.out.println("2. Find number of stock for branch 4");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice: ");
            choice = sigmaSkibidi.nextInt();

            switch (choice) {
                case 1:
                    displayIncome();
                    break;
                case 2:
                    findStock4();
                    break;
                case 3:
                    System.out.println("Exiting Program...");
                    return;
            }
        }
    }

    public static void displayIncome() {
        //Calculate Total Income for each branch
        int totalStocks;
        int totalIncome[] = new int[4];
        for (int i = 0; i < flowers.stocks.length; i++) {
            totalStocks = 0;
            for (int j = 0; j < flowers.stocks[i].length; j++) {
                totalStocks += flowers.stocks[i][j];
                totalIncome[i] = totalStocks * flowers.prices[j];
            }
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("========= Display Total Income =========");
        System.out.println("========================================");
        System.out.printf("%-20s %-15s %-15s %-15s %-15s %-15s %n", "", "Aglonema", "Keladi", "Alocasia", "Mawar", "Total Income");
        for (int i = 0; i < flowers.stocks.length; i++) {
            System.out.printf("%-20s ", "RoyalGarden " + (i + 1));
            for (int j = 0; j < flowers.stocks[i].length; j++) {
                System.out.printf("%-15d ", flowers.stocks[i][j]);
            }
            System.out.printf("Rp. %d %n", totalIncome[i]);
        }
        System.out.printf("%n%-20s ", "Prices for each");
        for (int i = 0; i < flowers.prices.length; i++) {
            System.out.printf("Rp. %-11d ", flowers.prices[i]);
        }

        System.out.println();
    }
    public static void findStock4() {
        System.out.println("===========================================================");
        System.out.println("========= Display Flowers Stock on the 4th Branch =========");
        System.out.println("===========================================================");

        System.out.println("Flowers stocks before dead flowers: ");
        System.out.printf("%-15s %-15s %-15s %-15s %n", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i = 0; i < flowers.stocks[3].length; i++) {
            System.out.printf("%-15d ", flowers.stocks[3][i]);
        }
        System.out.println("\n");
        System.out.println("===========================================================");

        //Calculate the flowers after dead ones
        int[] decreasedFlowers = new int[4];
        for (int i = 0; i < flowers.stocks[3].length; i++) {
            decreasedFlowers[i] = flowers.stocks[3][i] - flowers.dead[i];
        }

        System.out.println("\nFlowers stocks after dead flowers: ");
        System.out.printf("%-15s %-15s %-15s %-15s %n", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i = 0; i < flowers.stocks[3].length; i++) {
            System.out.printf("%-15d ", decreasedFlowers[i]);
        }

    }
}
