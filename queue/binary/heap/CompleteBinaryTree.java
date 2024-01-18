/**
 * Create by saurabh
 * Date: 14/01/24
 * Project Name: Tutorial
 */
package queue.binary.heap;

public class CompleteBinaryTree {
    int[] completeBinaryTree;
    int capacity;
    int size;
    public CompleteBinaryTree(int capacity){
        this.capacity = capacity;
        this.completeBinaryTree = new int[capacity];
        this.size = 0;
    }
    public void insert(int value) {
        if (size < capacity) {
            completeBinaryTree[size] = value;
            size++;
        } else {
            System.out.println("Tree is full. Cannot insert more elements.");
        }
    }
    public void printTreeArray() {
        System.out.println("Array Representation of Complete Binary Tree:");
        for (int i = 0; i < size; i++) {
            System.out.print(completeBinaryTree[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int capacity = 10;
        CompleteBinaryTree binaryTree = new CompleteBinaryTree(capacity);

        // Insert elements into the array
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.insert(6);

        // Print the array representation of the complete binary tree
        binaryTree.printTreeArray();
    }

}
