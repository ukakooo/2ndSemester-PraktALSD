package Assignment;

public class LecturerData {
    Lecturer[] lecturerData = new Lecturer[10];
    int idx;

    public void add(Lecturer lecturer) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = lecturer;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            System.out.println(
                "ID: " + lecturerData[i].id + ", Name: " + lecturerData[i].name + ", Gender: " + lecturerData[i].gender + ", Age: " + lecturerData[i].age);

        }
    }

    // Sort lecturers by age ascending using bubble sort
    public void sortAscending() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    // Sort lecturers by age descending using selection sort
    public void sortDescending() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j;
                }
            }
            Lecturer temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }
}
