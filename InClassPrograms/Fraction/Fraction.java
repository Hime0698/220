/*
* This is a class representing a fraction. It has two fields
* representing the numerator and denominator. It also has a bunch of
* functions such as two constructors, accessors and mutators (that
* provide some input validation) for the aforementioned fields, as well
* as a function to reduce the fraction, and it overrides the toString
* function in order to provide a neat way of representing any fraction
* object when printed.
*/

public class Fraction
{
    private int num;
    private int den;

    // Default constructor set numerator to 0 and denominator to 1
    public Fraction()
    {
	setNum(0);
	setDen(1);
    }

    // Second constructor takes two arguments and stores them in the
    // instance variables.
    public Fraction(int a, int b)
    {
	setNum(a);
	setDen(b);
	reduce();
    }

    // Accessor and mutator for the numerator
    public void setNum(int a)
    {
	num = a;
    }

    public int getNum()
    {
	return num;
    }

    // Accessor and mutator for the denominator. Mutator for the
    // denominator makes sure that the denominator cannot be set to 0.
    public void setDen(int b)
    {
	if (b == 0)
	    den = 1;
	else
	    den = b;
    }

    public int getDen()
    {
	return den;
    }

    // A function that provides the decimal equivalent of the fraction
    public double getReal()
    {
	return num * 1.0 / den;
    }

    // A function that adds two fractions and returns a Fraction
    // object that contains the sum.
    public Fraction add(Fraction other)
    {
	Fraction newF = new Fraction();
	newF.setNum(this.num * other.den + this.den * other.num);
	newF.setDen(this.den * other.den);
	newF.reduce();

	return newF;
    }
    
    public Fraction sub(Fraction other)
    {
	Fraction newF = new Fraction();
	newF.setNum(this.num * other.den - this.den * other.num);
	newF.setDen(this.den * other.den);
	newF.reduce();

	return newF;
    }
    
    public Fraction mult(Fraction other)
    {
	Fraction newF = new Fraction();
	newF.setNum(this.num * other.num);
	newF.setDen(this.den * other.den);
	newF.reduce();

	return newF;
    }

    public Fraction div(Fraction other)
    {
	Fraction newF = new Fraction();
	newF.setNum(this.num * other.den);
	newF.setDen(this.den * other.num);
	newF.reduce();

	return newF;
    }

    // A function to reduce the fraction. It does this by calculating
    // the greatest common factor (gcf) of the numerator and
    // denominator, and then dividing both by that factor.
    public void reduce()
    {
	// Begin by setting the variable min to whichever of the
	// numerator and denominator have the smallest absolute value.
	int min = Math.abs(num);
	if (Math.abs(den) < Math.abs(num))
	    min = Math.abs(den);

	// Count up from 2 to the minimum while checking for
	// divisibility in both numerator and denominator and updating
	// the gcf.
	int gcf = 1;
	for (int i = 2; i <= min; i++)
	{
	    if (num % i == 0 && den % i == 0)
		gcf = i;
	}
	
	// Divide the numerator and denominator by the gcf
	this.num /= gcf;
	this.den /= gcf;

	// Cater for the scenario that the division made the denominator
	// 0
	if (den == 0)
	    den = 1;
    }

    // toString function just provides the string representation of the
    // Fraction object we have just created. This string representation
    // includes the numerator, denominator, as well as the decimal
    // equivalent of the fraction.
    public String toString()
    {
	return num + "/" + den + " (" + getReal() + ")";
    }
}


