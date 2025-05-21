import java.util.LinkedList;
import java.util.List;

public class RemoveLastElement {
    public static void main(String[] args) {

        List<String> list = new LinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int n = 2;
        ListNode result = removeNthElement(head, n);

    }

    public static ListNode removeNthElement(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i=0; i<=n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        for(int i=0; i<n; i++) {
            first = first.next;
        }
        first.next = first.next.next;

        return dummy.next;
    }


}
