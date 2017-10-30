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

class I2P
{
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
                System.out.println(line); //change to pipe this into a form for Convert() (or maybe for Evaluate for now)
            }
            br.close();
        } catch (Exception e) {}
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
