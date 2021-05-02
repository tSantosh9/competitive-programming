package explore.practice.leetcode.problems.linkedlist;

/**
 * Merge two sorted linked lists and return it as a sorted list. 
 * The list should be made by splicing together the nodes of the first two lists.
 * 
 * @author Santosh Thapa
 *
 */
public class MergeTwoSortedLists {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode currentNode = null;
		while(l1 != null && l2 != null) {
			if(l1.val == l2.val) {
				ListNode temp1 = new ListNode(l1.val);
				ListNode temp2 = new ListNode(l2.val);
				if(currentNode == null) {
					result = currentNode = temp1;
					currentNode.next = temp2;
				} else {
					currentNode.next = temp1;
					currentNode.next.next = temp2;
				}				
				currentNode = temp2;
				l1 = l1.next;
				l2 = l2.next;
			} else {
				ListNode smallVal = null;
				if(l1.val < l2.val) {
					smallVal = new ListNode(l1.val);
					l1 = l1.next;
				} else if(l1.val > l2.val) {
					smallVal = new ListNode(l2.val);
					l2 = l2.next;
				}
				if(currentNode == null)
					result = currentNode = smallVal;
				else {
					currentNode.next = smallVal;
					currentNode = smallVal;
				}
			}
		}
		while(l1 != null) {
			ListNode node = new ListNode(l1.val);
			if(currentNode == null)
				result = currentNode = node;
			else {
				currentNode.next = node;
				currentNode = node;
			}
			l1 = l1.next;
		}
		while(l2 != null) {
			ListNode node = new ListNode(l2.val);
			if(currentNode == null)
				result = currentNode = node;
			else {
				currentNode.next = node;
				currentNode = node;
			}
			l2 = l2.next;
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode four = new ListNode(4);
		ListNode two = new ListNode(2, four);
		ListNode one = new ListNode(1, two);

		ListNode three = new ListNode(3);
		ListNode one1 = new ListNode(1, three);
		System.out.println("Start");
		ListNode result = mergeTwoLists(four, three);
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
		System.out.println();
	}

}
