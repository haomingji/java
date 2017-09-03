package test2;

import java.util.ArrayList;
import java.util.Collections;
 class ListNode {
	int val;
	ListNode next = null;

	public ListNode(int val) {
		this.val = val;
	}
}
public class niuke0903 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

 ArrayList<Integer> list = new ArrayList<Integer>();

      while(listNode != null){
     list.add(listNode.val);
       listNode = listNode.next;
         }

       Collections.reverse(list);
        return list;
}
	public static void main(String[] args) {
		niuke0903 n=new niuke0903();
	    ListNode listNode=new ListNode(2);
	    listNode.next=new ListNode(3);
	   
			
	System.out.println(n.printListFromTailToHead(listNode));	
	}
}

