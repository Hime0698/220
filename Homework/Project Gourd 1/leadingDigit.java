/* ***************************************************
 * Jacob Sennett && Tristan Williams
 * 9-27-17
 * List
 *
 * Program that calculates the leading digit statisatics from a list of numbers
 *************************************************** */

import java.io.*;
import java.util.ArrayList;

class leadingDigit
{
	public static int[] numCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //array for the number of leading digits
	public static double[] numPercent = new double[10]; // array to store the percentages
	public static ArrayList<String> numArray = new ArrayList<String>(); // array to store the read text

	public static void main(String [] args)
	{
		readFile();
		calculate();
		displayResults();



	}

	public static void readFile() //function to read the file
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String line;
			while((line = br.readLine()) !=null)
			{
				numArray.add(line.replaceAll(",", "")); //adds string of the number to the array minus any commas
			}

			br.close();
		} catch (Exception e) {}
	}

	public static void calculate()
	{
		int a = 0;
		for(int i = 0; i < numArray.size(); i++)
		{
			a = Integer.parseInt(numArray.get(i)); //converts string to integer and puts it in a variable a
			while(a >= 10) //finds the leading digit
			{
				a /= 10;
			}
			numCount[a]++; //adds one to the counter value stored at the index of the leading digit
			numPercent[a] = ((numCount[a]/(float)numArray.size()) * 100.00); //calculates the percentage of the leading digita
		}
	}


	public static void displayResults() //displays the results in the proper format
	{
		System.out.println("--------------------------------");
		System.out.println("Leading Digit  Count           %");
		System.out.println("--------------------------------");
		System.out.println("0\t" + numCount[0] + "\t" + String.format("%.2f", numPercent[0]) + "%");
		System.out.println("1\t" + numCount[1] + "\t" + String.format("%.2f", numPercent[1]) + "%");
		System.out.println("2\t" + numCount[2] + "\t" + String.format("%.2f", numPercent[2]) + "%");
		System.out.println("3\t" + numCount[3] + "\t" + String.format("%.2f", numPercent[3]) + "%");
		System.out.println("4\t" + numCount[4] + "\t" + String.format("%.2f", numPercent[4]) + "%");
		System.out.println("5\t" + numCount[5] + "\t" + String.format("%.2f", numPercent[5]) + "%");
		System.out.println("6\t" + numCount[6] + "\t" + String.format("%.2f", numPercent[6]) + "%");
		System.out.println("7\t" + numCount[7] + "\t" + String.format("%.2f", numPercent[7]) + "%");
		System.out.println("8\t" + numCount[8] + "\t" + String.format("%.2f", numPercent[8]) + "%");
		System.out.println("9\t" + numCount[9] + "\t" + String.format("%.2f", numPercent[9]) + "%");
		System.out.println("--------------------------------");
		System.out.println("Total\t" + numArray.size() + "\t" + "100.00%");
		System.out.println("================================");
	}
}
