// author: Nikan Kadkhodazadeh
abstract class BinarySearchTree{
    int size;

    protected Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        // Node constructor initializes data and left/right pointers
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public abstract Node add(int data);

    public int getSize() {return size;}
}