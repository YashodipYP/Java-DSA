public class size {
    class Node {
        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    class BinaryTree {


        static int size(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSize = size(root.left);
            int rightSize = size(root.right);

            return 1 + leftSize + rightSize;
        }

        public void main(String[] args) {
            Node root = new Node(1);

            root.left = new Node(2);
            root.right = new Node(3);

            root.left.left = new Node(4);
            root.left.right = new Node(5);

            root.right.left = new Node(6);

            System.out.println("Size of Binary Tree: " + size(root));
        }

    }

}
