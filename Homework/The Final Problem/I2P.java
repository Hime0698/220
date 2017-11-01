import java.io.*;
import java.lang.*;

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
1: Queueitems and evaluate should be the same
*/

class I2P<Jacob>
{

    public static Stack<Double> EvalQueue = new Stack<Double>();
    public static String[] Infix;

    public static void main(String [] args)
    {
        readLine();
        System.out.println(Infix[2]); // for debuging
        Evaluate();

    }

    public static void readLine()
    {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;

            while((line = br.readLine()) != null)
            {
                Infix = line.split("");
            }
            br.close();
        } catch (Exception e) {}
    }

    public static void Convert()
    {

    }

    public static void Evaluate()
    {
        for(int i = 0; i < Infix.length; i++)
        {
            String value = Infix[i];
            if(value == "+")
            {
                Double x = EvalQueue.Pop();
                Double y = EvalQueue.Pop();
                EvalQueue.Push((1.0 * x) + y);
            }

            else if(value == "-")
            {
                Double x = EvalQueue.Pop();
                Double y = EvalQueue.Pop();
                EvalQueue.Push((1.0 * x) - y);
            }

            else if(value == "/")
            {
                Double x = EvalQueue.Pop();
                Double y = EvalQueue.Pop();
                EvalQueue.Push((1.0 * x) / y);
            }

            else if(value == "*")
            {
                Double x = EvalQueue.Pop();
                Double y = EvalQueue.Pop();
                EvalQueue.Push((1.0 * x) * y);
            }

            else if(value == "^")
            {
                Double x = EvalQueue.Pop();
                Double y = EvalQueue.Pop();
                EvalQueue.Push(Math.pow((1.0 * x), y));
            }

            else if(value != "+" && value != "-" && value != "*" && value != "/" && value != "^")
            {
                EvalQueue.Push(1.0 * (Integer.parseInt(value)));
            }
            System.out.println(EvalQueue); // for debuging

        }
        System.out.println(EvalQueue); // for debuging
    }
}
