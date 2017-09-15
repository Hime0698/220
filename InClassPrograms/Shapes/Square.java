/*
* This is the entire Square class. All it contains is the constructor
* which receives a single argument, and calls the constructor of the
* superclass with two copies of that argument.
*/

public class Square extends Shape
{
    public Square(int side)
    {
	super(side, side);
    }
}
