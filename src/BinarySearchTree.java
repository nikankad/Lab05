public abstract class BinarySearchTree{

    protected Node root;

    static class Node {
        int data;
        Node left;
        Node right;
        int size;

        // Node constructor initializes data and left/right pointers
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public abstract boolean add(int data);

    public int getSize() {return root.size;}



}