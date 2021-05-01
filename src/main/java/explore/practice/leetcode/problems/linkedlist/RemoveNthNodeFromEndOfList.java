package explore.practice.leetcode.problems.linkedlist;

/**
 * Given the head of a linked list, remove the nth node from the end of the list 
 * and return its head. It should happen in one pass.
 * 
 * @author Santosh
 */
public class RemoveNthNodeFromEndOfList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null || n < 1) return head;
		ListNode tempHead = head;
		while(tempHead != null) {
			ListNode temp = tempHead;
			for(int i = 0; i < n; i++) {
				// Case when n is greater than the size of the list
				if(temp == null) 
					return head;
				temp = temp.next;
			}
			// Base case i.e. when the list contains only one node and n is also 1
			if(temp == null)
				return tempHead.next;
			if(temp.next == null) {
				tempHead.next = tempHead.next.next;
				break;
			}
			tempHead = tempHead.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		ListNode five = new ListNode(5);
		ListNode four = new ListNode(4, five);
		ListNode three = new ListNode(3, four);
		ListNode two = new ListNode(2, three);
		ListNode one = new ListNode(1, two);
		
		RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();
		ListNode result = solution.removeNthFromEnd(one, 1);
		
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
		System.out.println();
	}

}
