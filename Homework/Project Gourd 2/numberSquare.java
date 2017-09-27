import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class numberSquare
{
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String [] args)
    {
       scan();
       calculate();
    }

    public static void scan()
    {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt())
        {
          numbers.add(sc.nextInt());
        }
    }

    public static void calculate()
    {
        int greatest = 0;
        for(int a = 0; a < 380; a+=20 )
        {
            int i = a;
            for(int b = a; b <= i + 16; b++)
            {
                int sum = numbers.get(b) + numbers.get(b + 1) + numbers.get(b + 2) + numbers.get(b + 3);
                if(sum > greatest)
                    greatest = sum;
            }
        }
    System.out.println(greatest);
    }
}
