class Fraction
{
  private int numerator;
  private int denominator;

  public Fraction()
  {
    numerator = 1;
    denominator = 2;
  }

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

  double getReal()
  {
    return (double)numerator / denominator;
  }

  public Fraction add(Fraction other)
  {
    Fraction f = new Fraction();
    f.setNumerator(this.numerator * other.denominator + this.numerator * other.denominator);
    f.setDenominator(this.denominator * other.denominator);
    f.reduce();
    return f;
  }

  public Fraction sub(Fraction other)
  {
    Fraction f = new Fraction();
    f.setNumerator(this.numerator * other.denominator - this.numerator * other.denominator);
    f.setDenominator(this.denominator * other.denominator);
    f.reduce();
    return f;
  }

  public Fraction div(Fraction other)
  {
    Fraction f = new Fraction();
    f.setNumerator(this.numerator * other.denominator);
    f.setDenominator(this.denominator * other.numerator);
    f.reduce();
    return f;
  }

  public Fraction mult(Fraction other)
  {
    Fraction f = new Fraction();
    f.setNumerator(this.numerator * other.numerator);
    f.setDenominator(this.denominator * other.denominator);
    f.reduce();
    return f;
  }

  public void reduce()
  {
    int gcf = 1;
    int min = denominator;
    if(numerator < denominator)
    {
      min = numerator;
    }
    for(int i = 2; i <= min; i++)
    {
      if(numerator % i == 0 && denominator % i ==0)
      {
        gcf = i;
      }
    }
    numerator /= gcf;
    denominator /= gcf;
    if(denominator == 0)
    {
      denominator = 1;
    }
  }

  public String toString()
  {
    return this.numerator + "/" + this.denominator;
  }
}
