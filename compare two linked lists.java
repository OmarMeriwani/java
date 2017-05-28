/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    Node a = new Node();
    a.data = 0;
    a.next = headA;
    Node b = new Node();
    b.data = 0;
    b.next = headB;
    int result = 1 ;
    while (true)
    {
        if (a == null && b != null)
        {
            //System.out.println(a.data + " (1) " + b.data);
            result = 0;
            break; 
        }
        if (b == null && a != null)
        {
            //System.out.println(a.data + " (2) " + b.data);
            result = 0;
            break; 
        }  
        if (a.data != b.data )
        {
            //System.out.println(a.data + " (3) " + b.data);
            result = 0;
            break;
        }
       else
        {
            //System.out.println(a.data + " (4) " + b.data);
           if (a.next != null)
           {
               a = a.next;
               if (b.next != null)
               {
                   b = b.next;
               }
           }
           else
           {    
               if (b.next != null)
               {
                   result = 0;
                   break;
               }
               else
               {
                   result = 1;
                   break;
               }    
           }
        }
    }
    return result;
}
