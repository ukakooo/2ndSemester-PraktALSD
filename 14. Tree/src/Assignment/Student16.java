package Assignment;
public class Student16 {
    String nim, name, className;
    double ipk;

    public Student16() {

    }

    public Student16(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
    }
}