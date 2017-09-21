import java.io.*;

class leadingDigit
{
public static int[] numCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
public static double[] numPercent = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
public static int numLines = 0;
public static String[] numArray;


  public static void main(String [] args)
  {
    readFile();

  }
  public static void readFile()
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String line;
      numLines = 0;
      while((line = br.readLine()) !=null)
        numLines += 1;

      String[] numArray = new String[numLines];
      int i = 0;

      while((line = br.readLine()) !=null)
      {
        numArray[i] = line;
        i++;
      }

      System.out.println(numLines);
      System.out.println(numArray.length);
      System.out.println(numArray[1]);

      br.close();
    } catch (Exception e) {}

  }

  public static void calculate()
  {
    for(int i = 0; i < numLines; i++)
    {
      int a = Integer.parseInt(numArray[i]);
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
    numPercent[0] = (numCount[0]/numLines) * 100;
    numPercent[1] = (numCount[1]/numLines) * 100;
    numPercent[2] = (numCount[2]/numLines) * 100;
    numPercent[3] = (numCount[3]/numLines) * 100;
    numPercent[4] = (numCount[4]/numLines) * 100;
    numPercent[5] = (numCount[5]/numLines) * 100;
    numPercent[6] = (numCount[6]/numLines) * 100;
    numPercent[7] = (numCount[7]/numLines) * 100;
    numPercent[8] = (numCount[8]/numLines) * 100;
    numPercent[9] = (numCount[9]/numLines) * 100;

  }

  public static void readout()
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
    System.out.println("Total\t" + numLines + "\t" + "100.00%");
    System.out.println("================================");
  }
}
