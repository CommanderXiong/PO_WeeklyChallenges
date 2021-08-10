package LevelOrderTraversal;
import java.util.ArrayDeque;
import java.util.Queue;


public class Main {

	public static void main(String[] args) {
		Node<Integer> root = new Node<>(4);
		root.leftChild = new Node<Integer>(5);
		root.rightChild = new Node<Integer>(9);
		root.leftChild.leftChild = new Node<Integer>(6);
		root.leftChild.rightChild = new Node<Integer>(7);
		root.rightChild.leftChild = new Node<Integer>(8);
		
		traversal(root);

	}
	public static void traversal(Node<?> root) {
		Queue<Node> levelorder = new ArrayDeque<>();
		levelorder.add(root);
		 
        Node<?> current;
 
        while (!levelorder.isEmpty())
        {
        	current = levelorder.poll();
 
            System.out.print(current.data + ", ");
 
            if (current.leftChild != null) {
            	levelorder.add(current.leftChild);
            }
 
            if (current.rightChild != null) {
            	levelorder.add(current.rightChild);
            }
        }
	}
}
