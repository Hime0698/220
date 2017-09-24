import java.io.*;
import java.util.ArrayList;

class leadingDigit
{
	public static int[] numCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static double[] numPercent = new double[10];
	public static ArrayList<String> numArray = new ArrayList<String>();
	public static ArrayList<Integer> intArray = new ArrayList<Integer>();

	public static void main(String [] args)
	{
		readFile();
		calculate();
		displayResults();



	}

	public static void readFile()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String line;
			while((line = br.readLine()) !=null)
			{
				numArray.add(line);
			}

			System.out.println(numArray.size());
			System.out.println(numArray.get(0));

			br.close();
		} catch (Exception e) {}
	}

	public static void calculate()
	{
		int a = 0;
		for(int i = 0; i < numArray.size(); i++)
		{
			a = Integer.parseInt(numArray.get(i));
			while(a >= 10)
			{
				a /= 10;
			}
			numCount[a]++;
		}
		numPercent[a] = (numCount[a]/numArray.size()) * 100;
	}

	public static void displayResults()
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
