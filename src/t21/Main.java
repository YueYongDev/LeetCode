package t21;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);

        ListNode l = new Main().mergeTwoLists(l1, l2);
        while (l != null) {
            System.out.print(l.val+" ");
            l = l.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l0 = null;
        if (l1.val<l2.val){
            l0=l1;
            l0.next=mergeTwoLists(l1.next,l2);
        }else {
            l0=l2;
            l0.next=mergeTwoLists(l1,l2.next);
        }
        return l0;
    }
}
