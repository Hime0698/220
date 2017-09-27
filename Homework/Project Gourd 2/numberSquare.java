/* ***************************************************
 * Jacob Sennett && Tristan Williams
 * 9-27-17
 * List
 *
 * Program that calculates the greatest sum of 4 digits on a line in a square
 *************************************************** */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class numberSquare
{
    public static ArrayList<Integer> numbers = new ArrayList<Integer>(); //ArrayList to store the integers read from the file

    public static void main(String [] args)
    {
       scan();
       calculate();
    }

    public static void scan() //function to scan the file and add integers to an ArrayList
    {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt())
        {
          numbers.add(sc.nextInt());
        }
    }

    public static void calculate() //function to calculate the greatest four consecutive numbers
    {
        int greatest = 0;
        for(int a = 0; a < 380; a+=20 ) //loop that iterates to the next line
        {
            int i = a;
            for(int b = a; b <= i + 16; b++) //loop that iterates through the line
            {
                int sum = numbers.get(b) + numbers.get(b + 1) + numbers.get(b + 2) + numbers.get(b + 3); //determines the sum
                if(sum > greatest)
                    greatest = sum;
            }
        }
    System.out.println(greatest);
    }
}
