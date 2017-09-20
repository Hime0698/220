import java.io.*;

class leadingDigit
{
  public static void main(String [] args)
  {


  }

  public String [] readFile()
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String line;

      while((line = br.readLine()) !=null)
        System.out.println(line);
      br.close();
    } catch (Exception e) {}

  }
}
