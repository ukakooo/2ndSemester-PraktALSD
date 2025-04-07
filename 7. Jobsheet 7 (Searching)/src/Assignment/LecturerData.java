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
            System.out.print(i + ". ");
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

    // Search Lecturer by Name using Sequential Search
    public int findSeqSearch(String search) {
        int position = -1;
        for (int i = 0; i < idx; i++) {
            if (lecturerData[i].name.equalsIgnoreCase(search)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPositionNameSearch(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found.");
        }
    }

    public void showDataNameSearch(String x, int pos) {
        if (pos != -1) {
            System.out.println(
                "ID: " + lecturerData[pos].id + ", Name: " + lecturerData[pos].name + ", Gender: " + lecturerData[pos].gender + ", Age: " + lecturerData[pos].age);
        } else {
            System.out.println("Data : " + x + " is not found.");
        }
    }

    
    // Find lecturer by Age with binary as the helper
    public void findLecturerByAge(int search, int left, int right) {
        right = idx;
        int pos = findBinarySearch(search, left, right);

        if (pos == -1) {
            System.out.println("Data : " + search + " is not found.");
            return;
        }

        // Checking for duplicates by checking both left and right sides
        // Left
        int count = 1;
        int i = pos - 1;
        while (i >= 0 && lecturerData[i].age == search) {
            count++;
            i--;
        }

        // Right
        i = pos + 1;
        while (i <= idx - 1 && lecturerData[i].age == search) {
            count++;
            i++;
        }

        if (count > 1) {
            System.out.println("There are " + count + " lecturers with age " + search);
        } else {
            showPositionAgeSearch(search, pos);
            showDataAgeSearch(search, pos);
        }

    }

    public int findBinarySearch(int search, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2; // This way is also safer to prevent integer overflow
            
            if (search == lecturerData[mid].age) {
                return mid;
            } else if (lecturerData[mid].age > search) {
                return findBinarySearch(search, left, mid - 1);
            } else {
                return findBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }

    public void showPositionAgeSearch(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found.");
        }
    }

    public void showDataAgeSearch(int x, int pos) {
        if (pos != -1) {
            System.out.println(
                "ID: " + lecturerData[pos].id + ", Name: " + lecturerData[pos].name + ", Gender: " + lecturerData[pos].gender + ", Age: " + lecturerData[pos].age);
        } else {
            System.out.println("Data : " + x + " is not found.");
        }
    }
}
