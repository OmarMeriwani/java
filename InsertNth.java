//Any direct value assignment will cause head value to change, that's why we should use only the pointer to next
Node InsertNth(Node head, int data, int position) {
    Node n = new Node();
    n.data = data;
    Node p = new Node();
    p.next = head;
    
    Node r = p;
    
    for (int i = 0 ; i < position ; ++i)
    {    
        r = r.next;
    }
    n.next = r.next;
    r.next = n;
    return p.next;
}