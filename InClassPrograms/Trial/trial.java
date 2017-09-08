class Fraction
{
  private int numerator;
  private int denominator;

  public Fraction(int x, int y)
  {
    numerator = x;
    denominator = y;
  }

  // Accessor for numerator
  public int getNumerator()
  {
    return numerator;
  }

  // Accessor for denominator
  public int getDenominator()
  {

    return denominator;
  }

  // Mutator for numerator
  public void setNumerator(int x)
  {
    numerator = x;
  }

  //Mutator for denominator
  public void setDenominator(int y)
  {
    if (y == 0)
      denominator = 1;
    else
      denominator = y;
  }

  public double decimal()
  {
    return (double)numerator / denominator;
  }

}


class trial
{
  public static void main(String [] args)
  {
    Fraction f1 = new Fraction(1, 2);

    System.out.println(f1.decimal());
  }
}
