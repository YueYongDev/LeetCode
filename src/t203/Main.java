package t203;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(6);

        Main main = new Main();
        main.printList(listNode);
        main.removeElements(listNode, 6);
        main.printList(listNode);
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode root = new ListNode(1);
        root.next = head;
        // 调于记录要处理的元素的前驱结点
        ListNode prev = root;

        // prev.next表示要处理的结点
        while (prev.next != null) {
            // 要处理的结点是要删除的结点
            if (prev.next.val == val) {
                // 对结点进行删除操作
                prev.next = prev.next.next;
            }
            // 当前处理的节点不需要删除，prev移动到下一个结点
            else {
                prev = prev.next;
            }
        }

        // 返回新的根结点
        return root.next;
    }

    public void printList(ListNode tmp) {
        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
