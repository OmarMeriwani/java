Node Delete(Node head, int position) {
    Node p = new Node();
    p.next = head;
    Node r = p;
    for (int i = 0 ; i < position ; i ++)
        r = r.next;
    r.next = r.next.next;
    return p.next;
}