class Stack<Jacob>
{
    private List<Jacob> l;

    public Stack()
    {
        l = new List<Jacob>();
    }

    public Stack(Stack<Jacob> s)
    {
        l = new List<Jacob>(s.l);
    }

    public void Push(Jacob data)
    {
        l.First();
        l.InsertBefore(data);
    }

    public Jacob Pop()
    {
        l.First();
        Jacob data = l.GetValue();
        l.Remove();
        return data;
    }

    public Jacob Peek()
    {
        l.First();
        return l.GetValue();
    }

    public int Size()
    {
        return l.GetSize();
    }

    public boolean IsEmpty()
    {
        return l.IsEmpty();
    }

    public boolean IsFull()
    {
        return l.IsFull();
    }

    public boolean Equals(Stack<Jacob> s)
    {
        return this.l.Equals(s.l);
    }

    public Stack<Jacob> Add(Stack<Jacob> s)
    {
        Stack<Jacob> temp = new Stack<Jacob>();
        temp.l = l.Add(s.l);
        return temp;
    }

    public String toString()
    {
        return l.toString();
    }
}
