package offer;

import java.util.Stack;

/**
 * 剑指offer24
 * <p>
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class offer24 {
    public static void main(String[] args) {


    }

    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp =head;
        while(head !=null){
            stack.push(head);
            head = head.next;
        }
        ListNode dummy = new ListNode(-1);
        temp = dummy;
        while (!stack.isEmpty()) {
            temp = temp.next = stack.pop();
        }
        temp.next = null;
        return dummy.next;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
