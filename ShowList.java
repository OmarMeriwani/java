String ShowList(Node head)
{
    Node a = new Node ();
    a.next = head;
    a = a.next;
    String result = "";
    while (a != null)
    {
        result = result + a.data + " ";
        a = a.next;
    }   
    return result;
}
