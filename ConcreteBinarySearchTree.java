//ali
class ConcreteBinarySearchTree extends BinarySearchTree {
    @Override
    public Node add(int data) {
        root = insert(root, data);
        return root;
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        return node;
    }
}
