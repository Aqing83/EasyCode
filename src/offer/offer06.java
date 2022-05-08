package offer;

import java.util.Stack;

/**
 * 剑指offer06题
 * <p>
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class offer06 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next=new ListNode(3);
        listNode.next.next=new ListNode(2);
        listNode.next.next.next=new ListNode(6);


        System.out.println(reversePrint(listNode));
    }

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> Stack = new Stack<ListNode>();
        ListNode tmp = head;
        while (tmp != null) {
            Stack.push(tmp);
            tmp = tmp.next;
        }
        //这里将栈的大小存起来，不能在循环中直接用的原因是：随着Stack.pop()的执行，栈的大小会越来越小
        int size = Stack.size();
        int[] arr = new int[size];
        for (int i = 0; i < Stack.size(); i++) {
            arr[i] = Stack.pop().val;
        }
        return arr;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}



