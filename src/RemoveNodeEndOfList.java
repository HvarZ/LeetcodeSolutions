public class RemoveNodeEndOfList {
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


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentSizeCheck = head, currentDeleting = head;
        int sizeCounter = 0, passCounter = 0;

        while (currentSizeCheck.next != null) {
            sizeCounter++;
            currentSizeCheck = currentSizeCheck.next;
        }

        while (currentDeleting.next != null && passCounter != sizeCounter - n) {
            passCounter++;
            currentDeleting = currentDeleting.next;
        }

        if (passCounter > sizeCounter - n){
            head = head.next;
        } else {
            currentDeleting.next = currentDeleting.next == null ? null : currentDeleting.next.next;
        }

        return head;
    }
}
