/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    //System.out.println(ShowList(head));
    Node head2 = ReversePrint(head);
    //System.out.println(ShowList(head2));
    Node a = new Node();
    a.next = head2;
    int location = 0;
    while (location < n + 1)
    {
        //System.out.println("n = " + n + ", location = " + location + ", a value = " + a.data);
        a = a.next;
        location += 1;
    }   
    return a.data;
}
Node ReversePrint(Node head) {
    if (head == null)
        return null;
    Node p = new Node();
    p = head.next;
    Node head2 = new Node();
    head2.data = head.data;
    
    while (true)
    {    
        if (p == null)
            break;
        Node temp = new Node();
        temp.data = p.data;
        temp.next = head2;
        head2 = temp;
        p = p.next;
    }
    return head2;
}