package Assignment;

public class AssignmentMain {
    public static void main(String[] args) {
        Assignment assign[] = new Assignment[8];
        assign[0] = new Assignment("Ahmad", 220101001, 2022, 78, 82);
        assign[1] = new Assignment("Budi", 220101002, 2022, 85, 88);
        assign[2] = new Assignment("Cindy", 220101003, 2021, 90, 87);
        assign[3] = new Assignment("Dian", 220101004, 2021, 76, 79);
        assign[4] = new Assignment("Eko", 220101005, 2023, 92, 95);
        assign[5] = new Assignment("Fajar", 220101006, 2020, 88, 85);
        assign[6] = new Assignment("Gina", 220101007, 2023, 80, 83);
        assign[7] = new Assignment("Hadi", 220101008, 2020, 82, 84);

        AssignmentMain assignMain = new AssignmentMain();
        System.out.println(
                "The highest MidTerm score is: " + assignMain.findHighestMidTermScoreDC(assign, 0, assign.length - 1));
        System.out.println(
                "The lowest MidTerm score is: " + assignMain.findLowestMidTermScoreDC(assign, 0, assign.length - 1));
        System.out.println("The average FinalExam score is: " + assignMain.calculateFinalExamAverage(assign));

    }

    public int findHighestMidTermScoreDC(Assignment assign[], int low, int high) {
        if (low == high) {
            return assign[low].midTermScore;
        }
        int mid = (low + high) / 2;
        int left = findHighestMidTermScoreDC(assign, low, mid);
        int right = findHighestMidTermScoreDC(assign, mid + 1, high);
        if (left > right) {
            return left;
        } else {
            return right;
        }
    }

    public int findLowestMidTermScoreDC(Assignment assign[], int low, int high) {
        if (low == high) {
            return assign[low].midTermScore;
        }
        int mid = (low + high) / 2;
        int left = findLowestMidTermScoreDC(assign, low, mid);
        int right = findLowestMidTermScoreDC(assign, mid + 1, high);
        if (left < right) {
            return left;
        } else {
            return right;
        }
    }

    public double calculateFinalExamAverage(Assignment assign[]) {
        int sum = 0;
        for (int i = 0; i < assign.length; i++) {
            sum += assign[i].finalScore;
        }
        return sum / assign.length;
    }
}
