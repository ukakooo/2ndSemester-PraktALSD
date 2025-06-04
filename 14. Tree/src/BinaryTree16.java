public class BinaryTree16 {
    Node16 root;

    public BinaryTree16() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student16 data) {
        if (isEmpty()) {
            root = new Node16(data);
        } else {
            Node16 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node16(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node16(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find (double ipk) {
        boolean result = false;
        Node16 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }
}
