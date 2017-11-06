import java.io.*;
import java.lang.*;
import java.util.ArrayList;

/*
ToDo:
0: make Convert()
*/

/*
Note to self:
0: change Evaluate to take from convert instead of readLine
*/

class Infix2Postfix<Jacob>
{

    public static Stack<Double> EvalQueue = new Stack<Double>();
    public static String[] Infix;
    public static Queue<String> InfixQ = new Queue<String>();
    public static Queue<String> PostfixQ = new Queue<String>();
    public static Stack<String> operS = new Stack<String>();


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
                Infix = line.split(""); //puts the line into an array by indavidual letter
                for(int i = 0; i < Infix.length; i++)
                {
                    System.out.print(Infix[i]); // prints the infix statement
                }
                System.out.println();
                Convert(); //calls the conert fuction
            }
            br.close();
        } catch (Exception e) {}
    }

    public static void Convert() // function to convert from infix to postfix
    {
        operS = new Stack<String>();
        PostfixQ = new Queue<String>();
        InfixQ = new Queue<String>();
        for(int i = 0; i < Infix.length; i++)
        {
            InfixQ.Enqueue(Infix[i]);
        }

        while(!InfixQ.IsEmpty())
        {
            String token = InfixQ.Dequeue();
            if(IsOperand(token))
            {
                PostfixQ.Enqueue(token);
            }

            else if(token.equals(")"))
            {
                String op = operS.Pop();
                while(!"(".equals(op))
                {
                    PostfixQ.Enqueue(op);
                    op = operS.Pop();
                }
            }

            else
            {

                String op = operS.Peek();
                while(stackPrioraty(op) >= infixPriority(token)) //create prioraty functions
                {

                    op = operS.Pop();
                    PostfixQ.Enqueue(op);
                    op = operS.Peek();
                }
                operS.Push(token);
            }
        }

        while(!operS.IsEmpty())
        {
            String op = operS.Pop();
            PostfixQ.Enqueue(op);
        }
        System.out.println(PostfixQ);
        Evaluate();
    }

    public static int stackPrioraty(String x) //chexk for postfix prioraty
    {
        if ("^".equals(x) || "*".equals(x) || "/".equals(x))
            return 2;

        else if ("+".equals(x) || "-".equals(x))
            return 1;

        else
            return 0;
    }

    public static int infixPriority(String x) // checks the infix prioraty
    {
        if ("(".equals(x) || ")".equals(x))
            return 4;

        else if ("^".equals(x))
            return 3;

        else if ("*".equals(x) || "/".equals(x))
            return 2;

        else if ("+".equals(x) || "-".equals(x))
            return 1;

        else
            return 0;
    }

    public static boolean IsOperand(String value) //checks if something is and operancd
    {
        if(value.equals("+") || value.equals("-") || value.equals("/") || value.equals("*") || value.equals("^") || value.equals("(") || value.equals(")"))
            return false;

        return true;
    }

    public static void Evaluate() //evaluates postfix
    {
        while(!PostfixQ.IsEmpty())
        {
            String value = PostfixQ.Dequeue();
            // each of below contains a case for what to do if the charecter any operator including it not being an operator
            if(value.equals("+"))
            {
                Double y = EvalQueue.Pop();
                Double x = EvalQueue.Pop();
                EvalQueue.Push((1.0 * x) + y);
            }

            else if(value.equals("-"))
            {
                Double y = EvalQueue.Pop();
                Double x = EvalQueue.Pop();
                EvalQueue.Push((1.0 * x) - y);
            }

            else if(value.equals("/"))
            {
                Double y = EvalQueue.Pop();
                Double x = EvalQueue.Pop();
                EvalQueue.Push((1.0 * x) / y);
            }

            else if(value.equals("*"))
            {
                Double y = EvalQueue.Pop();
                Double x = EvalQueue.Pop();
                EvalQueue.Push((1.0 * x) * y);
            }

            else if(value.equals("^"))
            {
                Double y = EvalQueue.Pop();
                Double x = EvalQueue.Pop();
                EvalQueue.Push(Math.pow((1.0 * x), y));
            }

            else
            {
                EvalQueue.Push(1.0 * (Integer.parseInt(value)));
            }

        }
        System.out.println(EvalQueue.Pop()); //prints the result of evaluation
        System.out.println();
    }
}
