import java.util.Scanner;

public class LecturerDemo16 {
    Lecturer16 lecturerArray[] = new Lecturer16[3];
    

    public static void main(String[] args) {
        LecturerDemo16 demo16 = new LecturerDemo16();
        demo16.input();
        LecturerData16 data16 = new LecturerData16();
        data16.showAllLecturerData(demo16.lecturerArray);
        data16.countLecturersByGender(demo16.lecturerArray);
        data16.averageLecturerAgeByGender(demo16.lecturerArray);
        data16.showOldestLecturerInfo(demo16.lecturerArray);
        data16.showYoungestLecturerInfo(demo16.lecturerArray);

    }
    
    public void input(){
        Scanner sigmaSkibidi = new Scanner(System.in);
        for(int i = 0; i < lecturerArray.length; i++) {
            System.out.print("Lecturer ID: ");
            String id = sigmaSkibidi.nextLine();
            System.out.print("Lecturer Name: ");
            String name = sigmaSkibidi.nextLine();
            System.out.print("Lecturer Age: ");
            int age = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine();
            System.out.print("Lecturer Gender: ");
            boolean gender = sigmaSkibidi.nextBoolean();
            sigmaSkibidi.nextLine();
            lecturerArray[i] = new Lecturer16(id, name, gender, age);
        }
    }
}
