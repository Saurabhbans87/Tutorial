/**
 * Create by saurabh
 * Date: 13/01/24
 * Project Name: Tutorial
 */
package tree;

public class BinaryTree {
    static class Node{
        private int data;
        private Node leftChile;
        private Node rightChild;
        public Node(int data){
            this.data = data;
            this.leftChile = null;
            this.rightChild = null;
        }
    }
    Node root;
    public BinaryTree(){
        this.root = null;
    }
    public void createBinaryTree(){
        Node first = new Node(4);
        Node second = new Node(5);
        Node third = new Node(8);
        Node fourth = new Node(10);
        Node fifth = new Node(14);
        root = first;
        first.leftChile = second;
        first.rightChild = third;
        second.leftChile = fourth;
        second.rightChild = fifth;
    }
    public void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.leftChile);
        preOrder(root.rightChild);
    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);
    }
}
