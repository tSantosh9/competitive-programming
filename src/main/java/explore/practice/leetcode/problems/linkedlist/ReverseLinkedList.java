package explore.practice.leetcode.problems.linkedlist;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * @author Santosh
 *
 */
public class ReverseLinkedList {

	/**
	 * Iterative way
	 */
	public ListNode reverseList(ListNode head) {
		if(head == null) return head;
		ListNode prevNode = null;
		ListNode currentNode = head;
		ListNode nextNode = currentNode.next;
		while(nextNode != null) {
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.next;
		}
		currentNode.next = prevNode;
		return currentNode;		
	}
	
	public static void main(String[] args) {
		ListNode five = new ListNode(5);
		ListNode four = new ListNode(4, five);
		ListNode three = new ListNode(3, four);
		ListNode two = new ListNode(2, three);
		ListNode one = new ListNode(1, two);
		
		ReverseLinkedList solution = new ReverseLinkedList();
		ListNode result = solution.reverseList(one);
		
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
		System.out.println();
	}

}
