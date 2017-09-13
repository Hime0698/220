class Shape
{
  private int length;
  private int width;

  public Shapes(int length, int width)
  {
    this.length = length;
    this.width = width;
  }

  public void draw()
  {
    for (int i = 0; i < length; i++)
    {
      for (int j = 0; j< width; j++)
      {
        System.out.print("* ");
      }
      System.out.println():
  }
}

class Square extends Shape
{

}

class Triangle extends Shape
{

  void draw()
  {

  }
}
