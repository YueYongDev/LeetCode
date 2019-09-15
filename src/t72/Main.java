package t72;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(3);

        ListNode listNode = new Main().deleteDuplicates(l1);

        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode l1 = head;
        while (l1.next != null) {
            if (l1.val == l1.next.val) {
                if (l1.next.next == null) {
                    l1.next = null;
                } else {
                    l1.next = l1.next.next;
                }
            } else {
                l1 = l1.next;
            }
        }

        return head;
    }
}
