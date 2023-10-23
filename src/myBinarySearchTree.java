/*
@author Jere Perisic
@version October 23, 2023
 */
public class myBinarySearchTree extends BinarySearchTree {
    public myBinarySearchTree() {

    }

    @Override
    public boolean add(int data) {
        if (root == null) {
            root = new Node(data);
            getSize();
            return true;
        } else {
            if (addRecursive(root, data)) {
                getSize();
                return true;
            }
            return false;
        }
    }


    private boolean addRecursive(Node current, int data) {
        pass
    }
}
