package Assignments;

public class KRS {
    String nim, name, studyProgram, classaName;

    public KRS (String nim, String name, String studyProgram, String className) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.classaName = className;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + studyProgram + " - " + classaName);
    }
}
