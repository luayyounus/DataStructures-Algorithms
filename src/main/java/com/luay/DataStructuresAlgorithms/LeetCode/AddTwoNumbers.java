package com.luay.DataStructuresAlgorithms.LeetCode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode current = l3;
        ListNode x = l1;
        ListNode y = l2;
        int carry = 0;
        int sum = 0;
        int a;
        int b;
        while(x != null || y != null){
            sum = 0;
            a = (x != null) ? x.val : 0;
            b = (y != null) ? y.val : 0;
            sum = a + b + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            current.next = node;
            current = current.next;
            if (x != null) x = x.next;
            if (y != null) y = y.next;
        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return l3.next;
    }
}
