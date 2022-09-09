package Algorithm.First.Day5;

import java.awt.*;

public class MiddleOfLinkedList {
    public class ListNode {
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

    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        ListNode result = head;
        int halfCounter = 0;
        while (current.next != null) {
            if (halfCounter % 2 == 0) {
                result = result.next;
            }
            current = current.next;
            halfCounter++;
        }

        return result;
    }
}
