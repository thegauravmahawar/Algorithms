/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists">Merge Two Sorted Lists</a>
 */
public class MergeTwoSortedLists {

    public static class ListNode {
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

    public static void main(String... args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode result1 = mergeTwoLists(list1, list2);
    }

    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode currentNode = preHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = list1 == null ? list2 : list1;

        return preHead.next;
    }
}
