        Node DeleteLast(Node headA)
        {
            Node Pointer  = new Node();
            Pointer.next = headA;
            Pointer = Pointer.next;
            while(Pinter != null)
                {
                    if( Pointer.next==null || Pointer.next.data == null || Pointer.next.data == 0)
                    {
                        Pointer.next = null;
                        break;
                    }
                    else
                    {
                        Pointer = Pointer.next;
                    }
                }
             return headA;
        }