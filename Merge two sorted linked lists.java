Node mergeLists(Node headA, Node headB) {
    if (headB == null)
        return headA;
    if (headA == null)
        return headB;
    if (headB.data < headA.data)
    {
        headA = insertBefore(headA, headB);
        if (headB.next != null)
            headB = headB.next;
    }   
    if (headB.data > headA.data)
    {
        if (headA.next != null)
        {
            headA.next =  mergeLists(headA.next, headB);
        }
        else
        {
            headA.next = insertAfter(headA, headB);
        }
    }
    return headA;
}
Node insertBefore(Node headA, Node B)
{
    
     if (B == null)
        return headA;
    Node c = new Node();
    c.data = B.data;
    c.next = headA;
    return c;
}    
Node insertAfter(Node A, Node B)
{
    if (B == null)
        return A;
    Node b = new Node();
    b.data = B.data;
    b.next = null;
    A.next = b;
    return b;
}    
