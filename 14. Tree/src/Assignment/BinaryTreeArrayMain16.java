package Assignment;

public class BinaryTreeArrayMain16 {
    public static void main(String[] args) {
        BinaryTreeArray16 bta = new BinaryTreeArray16();
        Student16 m1 = new Student16("244107020138", "Devin", "TI-1I", 3.57);
        Student16 m2 = new Student16("244107020023", "Dewi", "TI-1I", 3.85);
        Student16 m3 = new Student16("244107020225", "Wahyu", "TI-1I", 3.21); 
        Student16 m4 = new Student16("244107020076", "Angelina", "TI-1I", 3.54);
        
        bta.add(m1);
        bta.add(m2);
        bta.add(m3);
        bta.add(m4);
        System.out.println("Pre-order transversal: ");
        bta.transversePreOrder(0);
    }
}
