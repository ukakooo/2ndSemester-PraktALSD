package Assignment;
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

    public void transversePreOrder (Node16 node) {
        if (node != null) {
            node.data.print();
            transversePreOrder(node.left);
            transversePreOrder(node.right);
        }
    }

    public void transverseInOrder (Node16 node) {
        if (node != null) {
            transverseInOrder(node.left);
            node.data.print();
            transverseInOrder(node.right);
        }
    }

    public void transversePostOrder (Node16 node) {
        if (node != null) {
            transversePostOrder(node.left);
            transversePostOrder(node.right);
            node.data.print();
        }
    }

    Node16 getSuccessor (Node16 del) {
        Node16 successor = del.right;
        Node16 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete (double ipk) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node16 parent = root;
        Node16 current = root;
        boolean isLeftChild = false;
        while (current.data.ipk != ipk) {
            parent = current;
            if (ipk < current.data.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }
        //Delete node with no children
        if (current.left == null && current.right == null) {
            if (current == null) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) { //Delete node with a left children
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {  //Delete node with a right children
            if (current == null) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {    //Delete node with two children
            Node16 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    // Assignment Section
    
}
