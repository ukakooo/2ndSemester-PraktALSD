import java.util.Scanner;

class studentData {
    static String[] courseName = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris", "Dasar Pemograman", "Praktikum Dasar Pemograman", "Kesehatan & Keselamatan Kerja" };
    // static double[] bobotSKS = { 3.50, 4.00, 3.00, 4.00, 4.00, 2.50, 2.50, 4.00
    // };
    static String[] letterGrade = new String[8];
    static double[] nilaiSetara = new double[8];
    static double[] scores = new double[8];
    
    static double totalNilaiSetara = 0;
    static double ip = 0;
}

public class Array {
    static Scanner sigmaSkibidi = new Scanner(System.in);

    public static void main(String[] args) {

        mainMenu();
        convertToNilaiSetara();
        calculateIP();
        viewScores();
    }

    public static void mainMenu() {
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < studentData.courseName.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + studentData.courseName[i] + ": ");
            studentData.scores[i] = sigmaSkibidi.nextDouble();
        }
    }

    public static void convertToNilaiSetara() {
        for (int i = 0; i < studentData.courseName.length; i++) {
            if (studentData.scores[i] > 80 && studentData.scores[i] <= 100) {
                studentData.letterGrade[i] = "A";
                studentData.nilaiSetara[i] = 4;
            } else if (studentData.scores[i] > 73 && studentData.scores[i] <= 80) {
                studentData.letterGrade[i] = "B+";
                studentData.nilaiSetara[i] = 3.5;
            } else if (studentData.scores[i] > 65 && studentData.scores[i] <= 73) {
                studentData.letterGrade[i] = "B";
                studentData.nilaiSetara[i] = 3;
            } else if (studentData.scores[i] > 60 && studentData.scores[i] <= 65) {
                studentData.letterGrade[i] = "C+";
                studentData.nilaiSetara[i] = 2.5;
            } else if (studentData.scores[i] > 50 && studentData.scores[i] <= 60) {
                studentData.letterGrade[i] = "C";
                studentData.nilaiSetara[i] = 2;
            } else if (studentData.scores[i] > 39 && studentData.scores[i] <= 50) {
                studentData.letterGrade[i] = "D";
                studentData.nilaiSetara[i] = 1;
            } else if (studentData.scores[i] <= 39) {
                studentData.letterGrade[i] = "E";
                studentData.nilaiSetara[i] = 0;
            } else {
                studentData.letterGrade[i] = "invalid";
            }
        }
    }

    public static void calculateIP() {
        studentData.totalNilaiSetara = 0;
        for (int i = 0; i < studentData.courseName.length; i++) {
            studentData.totalNilaiSetara += studentData.nilaiSetara[i];
        }
        studentData.ip = studentData.totalNilaiSetara / studentData.courseName.length;
    }
    

    public static void viewScores() {
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.printf("%-43s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < studentData.courseName.length; i++) {
            System.out.printf("%-43s %-20.2f %-20s %-20.2f\n", studentData.courseName[i], studentData.scores[i],
                    studentData.letterGrade[i], studentData.nilaiSetara[i]);
        }
        System.out.println("==============================");
        System.out.printf("IP: %-1.2f", studentData.ip);
    }
}