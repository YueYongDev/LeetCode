package t2;

import java.math.BigInteger;

public class Main {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (l1 != null) {
            sb1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            sb2.append(l2.val);
            l2 = l2.next;
        }
        String s1 = sb1.reverse().toString();
        String s2 = sb2.reverse().toString();
        BigInteger x = new BigInteger(s1).add(new BigInteger(s2));
        char[] cs = new StringBuilder(x + "").reverse().toString().toCharArray();
        int[] a = new int[cs.length];
        for (int i = 0; i < cs.length; i++) {
            a[i] = cs[i] - '0';
        }
        return ListNode(a);
    }

    public static void main(String[] args) {
        int[] a = {9};
        int[] b = {1, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        ListNode l1 = new Main().ListNode(a);
        ListNode l2 = new Main().ListNode(b);

        ListNode l = new Main().addTwoNumbers(l1, l2);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

    public ListNode ListNode(int[] s) {
        ListNode root = new ListNode(s[0]);//生成链表的根节点，并将数组的第一个元素的值赋给链表的根节点
        ListNode other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
        for (int i = 1; i < s.length; i++) {//由于已给root赋值，所以i从1开始
            ListNode temp = new ListNode(s[i]);//每循环一次生成一个新的节点,并给当前节点赋值
            other.next = temp;//将other的下一个节点指向生成的新的节点
            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
        }
        return root;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
