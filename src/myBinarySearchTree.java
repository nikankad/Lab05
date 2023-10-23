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


}
