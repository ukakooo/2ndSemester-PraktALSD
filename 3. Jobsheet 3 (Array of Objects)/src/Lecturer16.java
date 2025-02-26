
public class Lecturer16 {
    String id, name;
    boolean gender;
    int age;

    public Lecturer16(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void print(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Age: " + age);
    }
}