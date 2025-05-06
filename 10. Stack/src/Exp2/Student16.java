package Exp2;

public class Student16 {
    String nim;
    String name;
    String className;
    int grade;

    Student16() {

    }
    Student16(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    void grading(int grade) {
        this.grade = grade;
    }
}
