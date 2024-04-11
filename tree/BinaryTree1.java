/**
 * Create by saurabh
 * Date: 11/04/24
 * Project Name: Tutorial
 */
package tree;

public class BinaryTree1 {
    private Node root;
    static class Node{
        private int data;
        private Node leftChild;
        private Node rightChile;

        public Node(int data){
            this.data = data;
            this.leftChild = null;
            this.rightChile = null;
        }
    }
    public void printTree(Node root){
        if(root !=null){
            System.out.println(root.data);
            printTree(root.leftChild);
            printTree(root.rightChile);
        }

    }

    public static void main(String[] args) {
        BinaryTree1 binaryTree1 = new BinaryTree1();

        binaryTree1.root = new Node(10);
        binaryTree1.root.rightChile = new Node(8);
        binaryTree1.root.leftChild = new Node(9);

        binaryTree1.printTree(binaryTree1.root);
    }
}
