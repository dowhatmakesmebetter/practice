package algorithm;
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempNode = l1;
        int lengthL1 = 0;
        while(tempNode.next != null){
             lengthL1++;
        }
        int lengthL2 = 0;
        tempNode = l2;
        while(tempNode.next != null){
            lengthL2++;
        }
        ListNode l3 = new ListNode(0);
        int sign = 0;
        while (l1.next != null || l2.next != null ){
            int reminder = (l1.val + l2.val)%10 + sign;
            sign = (l1.val + l2.val)/10;

            l3.next = new ListNode(reminder);

        }
    }
}
