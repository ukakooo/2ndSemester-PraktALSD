public class LecturerMain16 {

    public static void main(String[] args) {
        Lecturer16 lecturer1 = new Lecturer16();
        lecturer1.lecturerID = "123456789";
        lecturer1.name = "Skibidi";
        lecturer1.startYear = 2016;
        lecturer1.expertiseField = "Windows 11";

        lecturer1.setStatus(true);
        System.out.println("Before Changes");
        lecturer1.print();
        lecturer1.changeExpertiseField("Arch Linux");
        System.out.println("\nAfter Changes");
        lecturer1.print();
        lecturer1.calculateTenure(2025);
        
        System.out.println();

        Lecturer16 lecturer2 = new Lecturer16("246810", "Sigma", 1990, "Windows 98");
        lecturer2.setStatus(false);
        System.out.println("Before Changes");
        lecturer2.print();
        lecturer2.changeExpertiseField("Windows Xp");
        System.out.println("\nAfter Changes");
        lecturer2.print();
        lecturer2.calculateTenure(2020);
    }

}
