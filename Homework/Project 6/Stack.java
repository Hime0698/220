/* ***************************************************
 * Jacob Sennett
 * 10-25-17
 * Stack
 *
 * Program that contains the stack addon for the list base
 *************************************************** */


class Stack<Jacob>
{
    private List<Jacob> l;

    public Stack() //constructer for empty Stack
    {
        l = new List<Jacob>();
    }

    public Stack(Stack<Jacob> s) // constructer to clone a Stack
    {
        l = new List<Jacob>(s.l);
    }

    public void Push(Jacob data) //adds the new data to the start of the Stack
    {
        l.First();
        l.InsertBefore(data);
    }

    public Jacob Pop() //reads the first item and then removes it
    {
        l.First();
        Jacob data = l.GetValue();
        l.Remove();
        return data;
    }

    public Jacob Peek() // just resds the first item in the Stack
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

    public boolean Equals(Stack<Jacob> s) //checks to see if two Stacks are the same
    {
        return this.l.Equals(s.l);
    }

    public Stack<Jacob> Add(Stack<Jacob> s) //adds two Stacks together
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
