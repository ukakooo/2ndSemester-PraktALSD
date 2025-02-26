public class LecturerData16 {
    public void showAllLecturerData(Lecturer16[] lecturerArray) {
        for (Lecturer16 lecturer : lecturerArray) {
            lecturer.print();
            System.out.println();
        }
    
    }
    
    public void countLecturersByGender(Lecturer16[] lecturerArray) {
        int male = 0;
        int female = 0;
        for (int i = 0; i < lecturerArray.length; i++) {
            if (lecturerArray[i].gender) {
                male++;
            } else {
                female++;
            }
        }
        System.out.println("\nMale Lecturer counts: " + male);
        System.out.println("Female Lecturer counts: " + female);
    }

    public void showOldestLecturerInfo(Lecturer16[] lecturerArray) {
        int oldestIndex = 0;
        for (int i = 0; i < lecturerArray.length; i++) {
            if (lecturerArray[i].age > lecturerArray[oldestIndex].age) {
                oldestIndex = i;
            }
        }
        System.out.println("\nOldest Lecturer Info: ");
        lecturerArray[oldestIndex].print();
    }

    public void showYoungestLecturerInfo(Lecturer16[] lecturerArray) {
        int youngestIndex = 0;
        for (int i = 0; i < lecturerArray.length; i++) {
            if (lecturerArray[i].age < lecturerArray[youngestIndex].age) {
                youngestIndex = i;
            }
        }
        System.out.println("\nYoungest Lecturer Info: ");
        lecturerArray[youngestIndex].print();
    }
}
