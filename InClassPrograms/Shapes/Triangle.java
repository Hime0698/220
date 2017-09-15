/*
* This is the Triangle class which inherits from the Shape class defined
* in the same folder.
*/
public class Triangle extends Shape
{
    // The Triangle constructor takes a single argument and then calls
    // the constructor of its superclass with two copies of that
    // argument since the Shape class requires both a length and width.
    public Triangle(int side)
    {
	super(side, side);
    }

    // The draw function defined in the Shape class is overriden here.
    // Recall that overriding basically means customizing a function
    // that is originally provided in a superclass and making it more
    // appropriate for the subclass.
    public void draw()
    {
	int side = getLength();
	for (int i = 0; i < getLength(); i++)
	{
	    for (int j = 0; j < side; j++)
	    {
		System.out.print("* ");
	    }
	    side--;
	    System.out.println();
	}
	
	System.out.println();	
    }
}
