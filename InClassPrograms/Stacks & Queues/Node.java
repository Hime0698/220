public class Node
{
    private int data;
    private Node link;

    // constructor
    public Node()
    {
        this.data = 0;
        this.link = null;
    }

    // accessor and mutator for the data component
    public int getData()
    {
        return this.data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    // accessor and mutator for the link component
    public Node getLink()
    {
        return this.link;
    }

    public void setLink(Node link)
    {
        this.link = link;
    }
}
