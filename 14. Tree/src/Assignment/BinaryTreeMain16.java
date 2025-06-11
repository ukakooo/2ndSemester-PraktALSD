package Assignment;
public class BinaryTreeMain16 {
    public static void main(String[] args) {
        BinaryTree16 bst = new BinaryTree16();
        bst.addRekursif(new Student16("244107020138", "Devin", "TI-1I", 3.57));
        bst.addRekursif(new Student16("244107020023", "Dewi", "TI-1I", 3.85));
        bst.addRekursif(new Student16("244107020225", "Wahyu", "TI-1I", 3.21)); 
        bst.addRekursif(new Student16("244107020076", "Angelina", "TI-1I", 3.54));
        System.out.println("In-order transversal: ");
        bst.transverseInOrder(bst.root);

        System.out.println();
        Student16 getMinIPK = bst.getMinIPK();
        Student16 getMaxIPK = bst.getMaxIPK();
        System.out.println("The minimum of IPK is: " + getMinIPK.ipk);
        System.out.println("The maximum of IPK is: " + getMaxIPK.ipk);

        System.out.println("\nStudents with IPK above 3.5: (Post-order transversal)");
        bst.displayStudentsWithIPKAbove(3.5);
    }
}
