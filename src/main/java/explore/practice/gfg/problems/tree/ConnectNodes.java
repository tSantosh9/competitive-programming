package explore.practice.gfg.problems.tree;

import java.util.LinkedList;

public class ConnectNodes {
	
	public void connect(Node root, LinkedList<Node> queue) {
		if(root == null) return;
		int count = 0, prevCount = 0;
		if(root.left != null) {
			queue.add(root.left);
			prevCount++;
		}
		if(root.right != null) {
			queue.add(root.right);
			prevCount++;
		}
		Node currentNode = null, prevNode = null;
		while(!queue.isEmpty()) {
			currentNode = queue.remove();
			prevCount -= 1;
			if(prevNode == null)
				prevNode = currentNode;
			else {
				prevNode.nextRight = currentNode;
				prevNode = currentNode;
			}
			if(currentNode.left != null) {
				queue.add(currentNode.left);
				count++;
			}
			if(currentNode.right != null) {
				queue.add(currentNode.right);
				count++;
			}
			if(prevCount == 0) {
				prevNode = null;
				prevCount = count;
				count = 0;
			}
		}
	}
	
	public void connect(Node root) {
		LinkedList<Node> queue = new LinkedList<>();
		connect(root, queue);
	}
	
	public static void main(String[] args) {
		
	}

	protected class Node{
		int data;
		Node left;
		Node right;
		Node nextRight;
		Node(int data){
			this.data = data;
			left=null;
			right=null;
			nextRight = null;
		}
	}

}
