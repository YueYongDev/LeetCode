package t237;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(5);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(9);
    }

    public void deleteNode(ListNode node) {
        if (node != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
