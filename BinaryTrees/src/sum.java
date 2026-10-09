public class sum {
    class Node {
        int data;
        Node left;
        Node right;

     Node(int data) {
            this.data = data;
            left = null;
            right = null;

    }

    class BinaryTree {


        static int sum(Node root) {
            if (root == null) {
                return 0;
            }

            return root.data + sum(root.left) + sum(root.right);
        }

        public void main(String[] args) {
            Node root = new Node(1);

            root.left = new Node(2);
            root.right = new Node(3);

            root.left.left = new Node(4);
            root.left.right = new Node(5);

            root.right.left = new Node(6);

            System.out.println("Sum: " + sum(root));
        }


    }


    }
}

