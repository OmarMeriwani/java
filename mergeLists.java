/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
        if (headA == null)
        {
        return (headB);
        }
        if (headB == null)
        {
        return headA;
        }
        //System.out.println("head B("+ headB.data +")");
        //System.out.println("head B("+ headB.data +")");
        Node A_current = new Node();
        A_current.next = headA;
        A_current = A_current.next;
        //System.out.println("Node A("+ A_current.data +")");
        //System.out.println("Node B("+ headB.data +")");
        while (headB != null)
        {
        while (A_current != null)
        {
        if (A_current.next != null)
        {
        //System.out.println("Node A under processing ("+ A_current.data +") next is ("+ A_current.next.data +") B is ("+ headB.data +")");
        if (headB.data < A_current.next.data && headB.data > A_current.data)
        {
        Node b_temp = new Node();
        b_temp.data = headB.data;
        //System.out.println("Node B("+ b_temp.data +") among A("+ A_current.data +") anb A("+ A_current.next.data +")");
        b_temp.next = A_current.next;
        A_current.next = b_temp;
        headB = headB.next;
        A_current = A_current.next;
        break;
        }
        if (headB.data > A_current.next.data)
        {    A_current = A_current.next;
        }
        }
        else
        {
        //break;
        }

        if (headB.next == null && A_current.data < headB.data)
        {
        Node b_temp = new Node();
        b_temp.data = headB.data;
        //System.out.println("Node B("+ b_temp.data +") after A("+ A_current.data +")");
        A_current.next = b_temp;
        headB = headB.next;
        break;
        }
        if (A_current.data == headA.data && A_current.data > headB.data)
        {
        Node b_temp = new Node();
        b_temp.data = headB.data;
        //System.out.println("Node B("+ b_temp.data +") before A("+ A_current.data +")");
        b_temp.next = A_current  ;
        A_current = b_temp;
        headA = A_current;
        headB = headB.next;
        break;
        }
        //System.out.println("headA=" + headA.data + ", currA=" + A_current.data + ", headB=" + headB.data);
        }
        }
        //System.out.println("A is ("+ ShowList(headA) +")");
        return headA;

        }
