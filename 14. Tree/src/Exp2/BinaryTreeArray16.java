package Exp2;

public class BinaryTreeArray16 {
    Student16[] data;
    int idxLast;

    public BinaryTreeArray16() {
        data = new Student16[10];
        idxLast = -1;
    }
    void populateData(Student16[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }
    void transverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                transverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                transverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
