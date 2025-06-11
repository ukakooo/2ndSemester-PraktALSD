package Exp2;

public class BinaryTreeArrayMain16 {
    public static void main(String[] args) {
        BinaryTreeArray16 bta = new BinaryTreeArray16();
        Student16 m1 = new Student16("244107020138", "Devin", "TI-1I", 3.57);
        Student16 m2 = new Student16("244107020023", "Dewi", "TI-1I", 3.85);
        Student16 m3 = new Student16("244107020225", "Wahyu", "TI-1I", 3.21); 
        Student16 m4 = new Student16("244107020076", "Angelina", "TI-1I", 3.54);
        Student16 m5 = new Student16("244107020223", "Andhika", "TI-1I", 3.72);
        Student16 m6 = new Student16("244107020226", "Bima", "TI-1I", 3.37);
        Student16 m7 = new Student16("244107020181", "Eiyu", "TI-1I", 3.46);
        
        
        Student16[] data = {m1, m2, m3, m4, m5, m6, m7};
        bta.populateData(data, data.length - 1);
        System.out.println("In-order transversal: ");
        bta.transverseInOrder(0);
    }
}
