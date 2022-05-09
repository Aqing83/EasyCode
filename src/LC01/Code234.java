package LC01;

import java.util.Stack;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class Code234 {
    public static void main(String[] args) {

        ListNode listNode = new ListNode();
        listNode.val=2;
        listNode.next=new ListNode(2,new ListNode(2,new ListNode(1,new ListNode())));
        System.out.println(isPalindrome(listNode));
    }

    static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode list = new ListNode();
        list = head;
        while (list.next != null) {
            stack.push(list.val);
            list = list.next;
        }
        list = head;

        while (list.next != null) {
            if (list.val != stack.peek()) {
                return false;
            }
            stack.pop();
            list = list.next;
        }

        return true;
    }

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
}

