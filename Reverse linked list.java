void ReversePrint(Node head) {
    if (head == null)
        return;
    Node p = new Node();
    p = head.next;
    Node head2 = new Node();
    head2.data = head.data;
    
    while (true)
    {    
        if (p == null)
            break;
        //System.out.print(p.data + " ");
        Node temp = new Node();
        temp.data = p.data;
        temp.next = head2;
        head2 = temp;
        p = p.next;
    }
    Node test = head2;
    while (true)
    {    
        if (test == null)
            break;
        System.out.println(test.data + " ");
        test = test.next;
    }
}
