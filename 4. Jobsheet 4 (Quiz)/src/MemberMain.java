public class MemberMain {
    public static void main(String[] args) {
        Member[] memberArray = new Member[3];

        memberArray[0] = new Member("Budi", 40, 16, 200000);
        memberArray[1] = new Member("John", 45, 12, 200000);
        memberArray[2] = new Member("Anto", 24, 17, 200000);

        for (int i = 0; i < memberArray.length; i++) {
            memberArray[i].totalCosts();
            memberArray[i].printData();
        }

        int totalFortyWorkout = 0;
        for (int i= 0; i < memberArray.length; i++) {
            if (memberArray[i].age > 40) {
                totalFortyWorkout += memberArray[i].workoutHours;
            }
        }

        int totalAge = 0;
        for (int i= 0; i < memberArray.length; i++) {
            if (memberArray[i].age <= 40 && memberArray[i].age >= 35) {
                totalAge += i + 1;
            }
        }

        System.out.println("Total workout hours of the members that are above 40 years old: " + totalFortyWorkout);
        System.out.println("The count of the members who aged between 35 and 40: " + totalAge);
    }
}
