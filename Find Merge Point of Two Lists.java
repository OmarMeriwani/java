/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) 
{
    Node a = headA;
    int v =0;
    while (true)   
    {
        if (IsNextOfB(headB, a))
        {    
            v = a.data;
            break;
        }
        else
        {   
            if (a.next != null)
            {
                a = a.next;
            }
        }
    }  
    return v;
}
Boolean IsNextOfB(Node headB, Node Current)
{
    Node b = new Node();
    b.next = headB;
    Boolean nb = false;
    while (true)
    {
        if (Current == b)
        {   
            nb = true;
            break;
        } 
        else
        {
            if (b.next != null)
                b = b.next;
            else
                break;
        }
    }
    return nb;
}
