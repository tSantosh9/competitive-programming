package explore.practice.leetcode.problems.linkedlist;

/**
 * Write a function to delete a node in a singly-linked list. 
 * You will not be given access to the head of the list, instead you will be 
 * given access to the node to be deleted directly.<br>
 * 
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 * 
 * @author Santosh
 *
 */
public class DeleteNodeInLinkedList {

	public void deleteNode(ListNode node) {
		if(node == null) return;
		node.val = node.next.val;
		node.next = node.next.next;
	}
	
	public static void main(String[] args) {
		ListNode five = new ListNode(5);
		ListNode four = new ListNode(4, five);
		ListNode three = new ListNode(3, four);
		ListNode two = new ListNode(2, three);
		ListNode one = new ListNode(1, two);
		
		DeleteNodeInLinkedList solution = new DeleteNodeInLinkedList();
		solution.deleteNode(one);
		
		while(one != null) {
			System.out.print(one.val + " ");
			one = one.next;
		}
		System.out.println();
	}

}
