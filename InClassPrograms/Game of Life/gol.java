import java.io.*;

class gol
{
  public static void main(String [] args)
  {
    readFile();
  }

  public static void readFile()
  {
    String [] file = null;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line;
    int i = 0;

    try
    {
      while((line = br.readLine()) != null)
      {
        if (i == 0)
          file = new String [line.length()];
        file[i] = line;
        i++;
      }
      br.close();
    } catch (Exception e) {}

    printArray(file);
    
  }

  public static void printArray(String [] arr)
  {
    for(int i = 0; i < arr.length; i++)
    {
      System.out.println(i + " -> " + arr[i]);
    }
  }
}
