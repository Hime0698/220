import java.io.*;
import java.util.ArrayList;

class leadingDigit
{
public static int[] numCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
public static double[] numPercent = new double[10];
public static int numLines = 0;
public static ArrayList<Integer> numArray = new ArrayList<Integer>();


	public static void main(String [] args)
 	{

 	}

	public static ArrayList readFile()
 	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String line;
			while((line = br.readLine()) !=null)
			{
				numArray.add(Integer.parseInt(line));
			}

			System.out.println(numLines);
			System.out.println(numArray.size());
			System.out.println(numArray.get(0));

			br.close();
			} catch (Exception e) {}
			return numArray;
	}

	public static arr[]
	for(int i = 0; i < numArray.size(); i++)
	{
	  int a = numArray.get(i);
	  while(a >= 10)
	  {
		a /= 10;
	  }
	  if(a == 0)
		numCount[0]++;
	  if(a == 1)
		numCount[1]++;
	  if(a == 2)
		numCount[2]++;
	  if(a == 3)
		numCount[3]++;
	  if(a == 4)
		numCount[4]++;
	  if(a == 5)
		numCount[5]++;
	  if(a == 6)
		numCount[6]++;
	  if(a == 7)
		numCount[7]++;
	  if(a == 8)
		numCount[8]++;
	  if(a == 9)
		numCount[9]++;
	}
	numPercent[0] = (numCount[0]/numArray.size()) * 100;
	numPercent[1] = (numCount[1]/numArray.size()) * 100;
	numPercent[2] = (numCount[2]/numArray.size()) * 100;
	numPercent[3] = (numCount[3]/numArray.size()) * 100;
	numPercent[4] = (numCount[4]/numArray.size()) * 100;
	numPercent[5] = (numCount[5]/numArray.size()) * 100;
	numPercent[6] = (numCount[6]/numArray.size()) * 100;
	numPercent[7] = (numCount[7]/numArray.size()) * 100;
	numPercent[8] = (numCount[8]/numArray.size()) * 100;
	numPercent[9] = (numCount[9]/numArray.size()) * 100;

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
	System.out.println("Total\t" + numLines + "\t" + "100.00%");
	System.out.println("================================");
  }
}
