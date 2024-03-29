import java.util.Random;

class Node
{
    private int data;
    private Node link;

    public Node()
    {
        this.data = 0;
        this.link = null;
    }

    public Node(int data)
    {
        this.data = data;
        this.link = null;
    }

    public int GetData()
    {
        return this.data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Node getLink()
    {
        return this.link;
    }

    public void setLink(Node n)
    {
        this.link = n;
    }
}

public class Links
{
    public static void main(String [] args)
    {
        Node head = new Node(10);
        createList(head, 100);

        printList(head);
    }

    public static void printList(Node a)
    {
        while(a != null)
        {
            System.out.print(a.GetData() + " -> ");
            a = a.getLink();
        }
        System.out.println("*");
    }

    public static void createList(Node a, int x)
    {
        Random r = new Random();

        for(int i = 0; i < x; i++, a = a.getLink())
        {
            a.setLink(new Node(r.nextInt(100)));
            //a.setData(r.nextInt(100));
            //a.setLink(new Node());
            //see second statment in for, it excecutes here.
        }
    }
}
