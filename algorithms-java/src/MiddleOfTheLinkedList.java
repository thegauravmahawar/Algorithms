/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list">Middle of the Linked List</a>
 */
public class MiddleOfTheLinkedList {

    public static void main(String... args) {

    }

    private static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
