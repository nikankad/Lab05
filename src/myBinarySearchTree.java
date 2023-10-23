/**
* @author Jere Perisic
* @version October 23, 2023
*
 * A simple binary search tree implementation that stores integers.
 */
public class myBinarySearchTree extends BinarySearchTree {
    private Node root;
    private boolean addReturn;
    public myBinarySearchTree() {

    }
    /**
     * Adds an integer to the binary search tree.
     *
     * @param item The integer to be added.
     * @return true if the item was added, false if it's a duplicate.
     */
    @Override
    public boolean add(int item) {
        root = addRecursiveHelper(root, item);
        return addReturn;
    }
    /**
     * Helper method to add an integer to the binary search tree.
     *
     * @param localRoot The root of the current subtree.
     * @param item      The integer to be added.
     * @return The (possibly new) local root of the subtree that now contains the inserted item.
     */
    private Node addRecursiveHelper(Node localRoot, int item) {
        if (localRoot == null) {
            addReturn = true;
            return new Node(item);
        } else if (item == localRoot.data) {
            addReturn = false;
            return localRoot;
        } else if (item < localRoot.data) {
            localRoot.left = addRecursiveHelper(localRoot.left, item);
            return localRoot;
        } else {
            localRoot.right = addRecursiveHelper(localRoot.right, item);
            return localRoot;
        }
    }

}
