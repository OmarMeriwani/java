/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) 
{
    Node a = new Node();
    a.next = head;
    a = a.next;
    while (true)
    {
        if (a.next != null)
        {
            int aa = a.data;
            int aaa = a.next.data;
            if (aa == aaa)
            {
                if (a.next.next != null)
                {
                    a.next = a.next.next;
                }    
                else
                {
                    a.next = null;
                }
            }
            else                
            {
                a = a.next;
            }
        }
        else
        {
            break;
        }
    }   
    return head;
}