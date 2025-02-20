public class CourseMain16 {
    public static void main(String[] args) {
        Course16 course1 = new Course16();
        course1.name = "Operating System";
        course1.courseID = "MK02-01";
        course1.credit = 24;
        course1.hour = 6;
        System.out.println("Before Changes");
        course1.print();
        course1.changeCredit(50);
        course1.addHour(6);
        course1.reduceHour(2);
        System.out.println("\nAfter Changes");
        course1.print();

        Course16 course2 = new Course16("MK02-02", "Interface Design", 24, 6);
        System.out.println("\nBefore Changes");
        course2.print();
        course2.changeCredit(50);
        course2.addHour(6);
        course2.reduceHour(2);
        System.out.println("\nAfter Changes");
        course2.print();
    }
}
