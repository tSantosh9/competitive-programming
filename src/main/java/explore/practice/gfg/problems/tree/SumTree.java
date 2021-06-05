package explore.practice.gfg.problems.tree;

/**
 * 
 * @author Santosh Thapa
 * 
 * <br>
 * Given a Binary Tree. Return 1 if, for every node X in the tree other than the leaves, 
 * its value is equal to the sum of its left subtree's value and its right subtree's value. 
 * Else return 0.<br>
 * An empty tree is also a Sum Tree as the sum of an empty tree can be considered to be 0. 
 * A leaf node is also considered a Sum Tree.
 * <br><br>
 * Expected Time Complexity: O(N) <br>
 * Expected Auxiliary Space: O(Height of the Tree)
 *
 */
public class SumTree {

	int sumTree(Node root) {
		if(root.left == null && root.right == null)
			return root.data;
		int sum = 0;
		if(root.left != null)
			sum = sumTree(root.left);
		if(sum != -1 && root.right != null)
			sum += sumTree(root.right);
		return sum == root.data ? sum + root.data : -1;
	}

	boolean isSumTree(Node root) {
		if(root == null) return true;
		return sumTree(root) == -1 ? false : true;
	}

	public static void main(String[] args) {

	}

	class Node	{
		
		int data;
		Node left, right;

		Node(int item)	{
			data = item;
			left = right = null;
		}
	}

}
