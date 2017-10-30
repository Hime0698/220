import java.io.*;

/*
ToDo:
0: Except input in format usable by Evaluate()
1: make Evaluate()
2: make Convert()
*/

/*
Note to self:
0: Evaluate() will need to look at the indavidual charecters in the expression, think of when
    and how this change will occur.
1:
*/

class I2P<Jacob>
{

    //make a Queue

    public static void main(String [] args)
    {
        readLine();

    }

    public static void readLine()
    {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;

            while((line = br.readLine()) != null)
            {
                String[] Infix = line.split(""); //change to pipe this into a form for Convert() (or maybe for Evaluate for now)
            }
            br.close();
        } catch (Exception e) {} 
    }

    public static Queue<jacob> QueueItems([] x)
    {
        for(i = 0; i < x.length(); i++)
        {
            //push item at array location i to queue
        }
    }

    public static Convert()
    {

    }

    public static Evaluate()
    {
        //Base case for the string of + - / *
        //pop x2 and eval


    }
}
