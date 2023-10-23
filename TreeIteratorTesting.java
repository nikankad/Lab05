//Adds items to a binary search tree and performs operations using the sequence array of the tree
public class TreeIteratorTesting {
	
	int[] sequenceArr;
	
	//Add items to the tree, get a sequence array of the tree
	public TreeIteratorTesting(BinarySearchTree bst, ITreeIterator treeIter) {
		bst.add(1);
		bst.add(2);
		bst.add(3);
		bst.add(4);
		bst.add(5);
		sequenceArr = treeIter.SequenceArray(bst);
		
	}
	//Finds the average of the tree values
	public double average() {
		
		double total = 0;
		double divisor = 0;
		
		//Iterate through sequence array
		for(int i = 0; i < sequenceArr.length; i++) {
			total+=sequenceArr[i];
			divisor++;
		}
		
		//Return the average
		return total/divisor;
	}
	//Finds the max of the tree values
	public int max() {
		
		int idxOfLargest = 0;
		
		//Iterate through sequence array
		for(int i = 0; i < sequenceArr.length; i++) {
			//If the current index's value is larger than the previous largest, current index is the new largest
			if(sequenceArr[i]>sequenceArr[idxOfLargest]) {
				idxOfLargest = i;
			}
		}
		
		return sequenceArr[idxOfLargest];
	}
}
