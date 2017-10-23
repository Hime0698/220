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
        List();
    }

    public Stack(Stack<Jacob> s)
    {
        List(s);
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
        Size();
    }

    public boolean IsEmpty()
    {
        return IsEmpty();
    }

    public boolean IsFull()
    {
        return IsFull();
    }

    public boolean Equals(Stack<Jacob> l)
    {
        Equals(l);
    }

    public Stack<Jacob> Add(Stack<Jacob> l)
    {
        Add(l);
    }

    public String toString();
    {
        toString();
    }
}
