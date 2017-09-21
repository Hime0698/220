import java.io.*;

class leadingDigit
{
  public static void main(String [] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String line;
      int numLines = 0;
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
}
