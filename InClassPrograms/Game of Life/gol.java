import java.io.*;

class gol
{
  public static void main(String [] args)
  {
    boolean [][] thefile = readFile();
    printArray(thefile);
  }

  public static boolean [][] readFile()
  {
    boolean [][] file = null;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line;
    int i = 0;

    try
    {
      while((line = br.readLine()) != null)
      {
        if (i == 0)
          file = new boolean[line.length()][line.length()];

        for(int j=0; j < line.length(); j++)
          file[i][j] = (line.charAt(j) == '*');

        i++;
              }
      br.close();
    } catch (Exception e) {}

    return file;

  }

  public static void printArray(boolean [][] arr)
  {
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        System.out.println(arr[i][j]);
      }
      System.out.println();
    }
  }
}
