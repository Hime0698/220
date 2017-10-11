class Queue
{
    Node head;
    Node tail;

    public Queue()
    {
        head = null;
        tail = null;
    }

    public void enqueue(int x)
    {
        Node n = new Node();
        n.setData(x);
        n.setLink(null);

        if(head == null)
        {
            head = tail = n;
        }
        else
        {
            tail.setlink(n);
            tail = n;
        }
    }

    public int dequeue()
    {
        if(head != null)
        {
            Node q = head;
            head = head.getLink();
            return q.getData();
        }
        return -1;
    }

    public String toString()
    {
        if(head == null)
            return "NULL";
        else
        {
            String s = "";
            Node n = head;

            while(n != null)
            {
                s+= n.getData() + ", ";
                s = n.getLink();
            }
            return s;
        }
    }
}
