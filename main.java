class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class main {

    public static void print(Node root) {
        if (root == null) return;
        System.out.println(root.val); // Visit root
        print(root.left);             // Traverse left subtree
        print(root.right);            // Traverse right subtree
    }

    public  static  int  size (Node root){
        if (root == null) return 0; // Base case: empty tree
        return 1 + size(root.left) + size(root.right); 
               
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);

        // Creating a binary tree structure
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        // Call to print method
        print(a);
        System.out.println("Size of the tree: " + size(a)); 
    }
}
