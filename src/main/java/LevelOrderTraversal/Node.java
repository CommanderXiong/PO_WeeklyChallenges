package LevelOrderTraversal;

public class Node<T> {
	public T data;
	public Node<?> leftChild;
	public Node<?> rightChild;
	public Node(T data){
		this.data = data;
	}
}
