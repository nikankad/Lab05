public class lab05 {

  public static void main(String[] args) {
    BinarySearchTree myBinarySearchTree = new bst();
    ITreeIterator MyTreeInterator = new ITreeIterator() {
      @Override
      public int[] SequenceArray(BinarySearchTree bst) {
        return new int[0];
      }
    };
    TreeIteratorTesting TreeTest = new TreeIteratorTesting(myBinarySearchTree, MyTreeInterator);

    System.out.println("test");
    
  }
}
