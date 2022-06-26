public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currResult = result;
        ListNode currNode1 = l1;
        ListNode currNode2 = l2;
        int partResult;

        while (currNode1 != null || currNode2 != null) {
            partResult = (currNode1 == null ? 0 : currNode1.val) +
                         (currNode2 == null ? 0 : currNode2.val) +
                          currResult.val;

            if ((currNode1 != null && currNode1.next != null) ||
                (currNode2 != null && currNode2.next != null) ||
                 partResult >= 10) {
                currResult.next = new ListNode();
            }

            if (partResult > 9) {
                currResult.val = (partResult % 10);
                currResult.next.val++;
            } else {
                currResult.val = partResult;
            }

            currNode1 = currNode1 != null ? currNode1.next : null;
            currNode2 = currNode2 != null ? currNode2.next : null;
            currResult = currResult.next;
        }

        return result;
    }
}
