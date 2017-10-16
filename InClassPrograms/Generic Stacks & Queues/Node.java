public class Node<jordan>
{
    private jordan data;
    private Node<jordan> link;

    // constructor
    public Node()
    {
        this.data = null;
        this.link = null;
    }

    // accessor and mutator for the data component
    public jordan getData()
    {
        return this.data;
    }

    public void setData(jordan data)
    {
        this.data = data;
    }

    // accessor and mutator for the link component
    public Node<jordan> getLink()
    {
        return this.link;
    }

    public void setLink(Node<jordan> link)
    {
        this.link = link;
    }
}
