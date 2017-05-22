Node Insert(Node head,int data) {
  Node n = new Node();
  n.data = data;
  Node tail = head;
  while (tail.next != null)
  {
      tail = tail.next;
  }
  tail.next = n;  
  return head;
}