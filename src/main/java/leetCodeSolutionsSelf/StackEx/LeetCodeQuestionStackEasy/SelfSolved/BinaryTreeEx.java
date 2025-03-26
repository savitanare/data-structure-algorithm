package main.java.leetCodeSolutionsSelf.StackEx.LeetCodeQuestionStackEasy.SelfSolved;
public class BinaryTreeEx {
    Node root;

    // Inorder traversal (Left, Root, Right)
    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        
        printInorder(node.right);
        System.out.print(node.data + " ");
    
    }

    public static void main(String[] args) {
        BinaryTreeEx tree = new BinaryTreeEx();

        // Creating a sample tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal: ");
        tree.printInorder(tree.root);

        // System.out.println("\nPreorder traversal: ");
        // tree.printPreorder(tree.root);

        // System.out.println("\nPostorder traversal: ");
        // tree.printPostorder(tree.root);
    }

    
}
