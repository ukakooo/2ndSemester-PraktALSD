package Assignment;

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

    void transverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                transverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                transverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Assignment Section

    void transversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].print();
                transversePreOrder(2 * idxStart + 1);
                transversePreOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Student16 data) {
        if (idxLast == -1) {
            this.data[0] = data;
            idxLast = 0;
        } else {
            recursiveAddHelper(0, data);
        }
    }

    private void recursiveAddHelper(int currentIdx, Student16 data) {
        if (currentIdx > this.data.length - 1) {
            System.out.println("The Tree is full.");
            return;
        }

        if (this.data[currentIdx] == null) {
            this.data[currentIdx] = data;
            idxLast = currentIdx;
        } else if (data.ipk < this.data[currentIdx].ipk) {
            recursiveAddHelper(2 * currentIdx + 1, data);
        } else if (data.ipk > this.data[currentIdx].ipk) {
            recursiveAddHelper(2 * currentIdx + 2, data);
        } else {

        }
    }
}
