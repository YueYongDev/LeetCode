package t141;

public class Main {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = node.next;

        Main main = new Main();
        System.out.println(main.hasCycle(node));

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode faster = head;
        ListNode slower = head;
        while (faster.next != null && faster.next.next != null) {
            slower = slower.next;
            faster = faster.next.next;
            if (faster == slower)
                return true;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}