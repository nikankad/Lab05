//ali 
import java.util.ArrayList;
import java.util.List;

public class myTreeIterator implements ITreeIterator {

    @Override
    public int[] SequenceArray(BinarySearchTree bst) {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(bst.root, result);  
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inOrderTraversal(BinarySearchTree.Node node, List<Integer> result) {
        if (node != null) {
            inOrderTraversal(node.left, result);  
            result.add(node.data);  
            inOrderTraversal(node.right, result);  
        }
    }
    public static void main(String[] args) {
        // Create a BinarySearchTree
        BinarySearchTree bst = new ConcreteBinarySearchTree(); // Replace ConcreteBinarySearchTree with your concrete implementation.

        // Add some elements to the tree
        bst.add(4);
        bst.add(2);
        bst.add(6);
        bst.add(1);
        bst.add(3);
        bst.add(5);
        bst.add(7);

        // Create the iterator
        myTreeIterator iterator = new myTreeIterator();

        // Get the array of integers by iterating the tree
        int[] resultArray = iterator.SequenceArray(bst);

        // Print the result
        for (int value : resultArray) {
            System.out.print(value + " ");
        }

    }
}
