package org.example.leetcode;

import org.example.system.AbstractExampleClass;

public class MergeTwoSortedLists extends AbstractExampleClass {
//https://leetcode.com/problems/merge-two-sorted-lists/
    /*
    You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

это не линкед лист, это объединение сортированых СТЭКОВ.
     */

    @Override
    public void runContent() {
        ListNode list1 = getList1();
        ListNode list2 = getList2();

        ListNode listNode = mergeTwoLists(list1,list2);

    }

    private ListNode getList1() {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        (ln.next).next = new ListNode(4);

        return ln;
    }

    private ListNode getList2() {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(3);
        (ln.next).next = new ListNode(5);

        return ln;
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode pointer = result;

        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                pointer.next = list2;
                list2 = list2.next;
            } else if (list1.val<list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            }
            pointer = pointer.next;
        }

        if (list1 != null) {
            pointer.next = list1;
        } else if (list2 != null) {
            pointer.next = list2;
        }

        return result.next;
    }



    private class ListNode {
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
