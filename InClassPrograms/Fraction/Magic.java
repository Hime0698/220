/*
* This is the class containing the main function that drives the entire
* program. All it does right now is create two fractions, add them and
* store the result in a third fraction, and then print out all three
* functions. If you want to test out your other functions e.g. sub,
* mult, div, etc, feel free to edit this file accordingly.
*/

public class Magic
{
    public static void main(String [] args)
    {
	Fraction a = new Fraction(2, 12);
	Fraction b = new Fraction(-10, 24);
	    
	// Create a new fraction c that is the result of calling the
	// "add" function of fraction a with fraction b as its argument.
	Fraction c = a.add(b);
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
    }
}
