/* ***************************************************
 * Jacob Sennett
 * 10-23-17
 * Stack
 *
 * Implaments the stack commands
 *************************************************** */

class Stack<Jacob> extends List<Jacob>
{
    private Node<Jacob> head;
    private Node<Jacob> tail;
    private Node<Jacob> curr;
    private int num_items;

    public Stack()
    {
        head = null;
		curr = tail = head;
		num_items = 0;
    }

    public Stack(Stack<Jacob> l)
    {
		head = null;
		curr = tail = head;
		num_items = 0;
		for(Node<Jacob> a = l.head; a != null; a = a.getLink())
			InsertAfter(a.getData());
	}

    public void Push(Jacob data)
    {
        First();
        InsertBefore(data);
    }

    public Jacob Pop()
    {
        First();
        Jacob x = GetValue();
        Remove();
        return x;
    }

    public Jacob Peek()
    {
        First();
        return GetValue();
    }

    public int Size()
    {
        return GetSize();
    }

    public Stack<Jacob> Add(Stack<Jacob> l)
    {
        add(l);
    }

	/*public String toString()
    {
        if(!IsEmpty())
		{
			Node<Jacob> a = head;
			String s = "";
			while(a != null)
			{

				s += a.getData().toString() + " ";
				a = a.getLink();
			}
			return s;
		}
		return "NULL";
    }*/
}
