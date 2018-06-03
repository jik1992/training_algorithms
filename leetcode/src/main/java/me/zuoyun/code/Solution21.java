package me.zuoyun.code;

/**
 * Created by ZuoYun on 2018/6/2. Time: 12:10 PM Information:
 */
public class Solution21 {

  public static class ListNode {

    int      val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    Integer value = 0;

    if (l1 == null && l2 == null) {
      return null;
    }

    if (l1 == null) {
      value = l2.val;
      l2 = l2.next;
    } else if (l2 == null) {
      value = l1.val;
      l1 = l1.next;
    } else if (l1.val < l2.val) {
      value = l1.val;
      l1 = l1.next;
    } else {
      value = l2.val;
      l2 = l2.next;
    }

    ListNode temp = new ListNode(value);
    ListNode index = temp;

    if (l1 == null && l2 == null) {
      return index;
    }

    do {
      if (l1 == null) {
        value = l2.val;
        l2 = l2.next;
      } else if (l2 == null) {
        value = l1.val;
        l1 = l1.next;
      } else if (l1.val < l2.val) {
        value = l1.val;
        l1 = l1.next;
      } else {
        value = l2.val;
        l2 = l2.next;
      }

      temp.next = new ListNode(value);
      temp = temp.next;

    } while (l1 != null || l2 != null);
    return index;
  }


  public static void main(String[] args) {
    ListNode s1 = new ListNode(1);
    ListNode temp = s1;
    s1.next = new ListNode(2);
    s1 = s1.next;
    s1.next = new ListNode(4);

    ListNode s2 = new ListNode(1);
    ListNode temp2 = s2;
    s2.next = new ListNode(3);
    s2 = s2.next;
    s2.next = new ListNode(4);

    ListNode result = new Solution21().mergeTwoLists(temp, temp2);
    do {
      System.out.println(result.val);
      result = result.next;

    } while (result != null);

  }

}
