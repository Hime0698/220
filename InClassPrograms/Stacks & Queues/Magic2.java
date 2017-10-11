import java.util.Random;

class Magic2
{
    public static void main(String [] args)
    {
        Random r = new Random();
        Queue q = new Queue();

        for(int i = 0; i < 20; i++)
        {
            q.enqueue(r.nextInt(100));
        }

        System.out.println(q);

        in x = q.dequeue();

        while(c != -1)
        {
            System.out.print(x + ", ");
            x = q.dequeue();
        }
        System.out.println();

        System.out.println(q);
    }
}
