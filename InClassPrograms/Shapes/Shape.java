/*
* This is the Shape class. It has two fields in its state, and a draw
* function as its behaviour. It also contains accessors and mutators for
* the two fields.
*/

public class Shape
{
    private int length;
    private int width;

    public Shape(int x, int y)
    {
	setLength(x);
	setWidth(y);
    }

    public void setLength(int x)
    {
	if (x >= 0)
	    length = x;
    }

    public void setWidth(int y)
    {
	if (y >= 0)
	    width = y;
    }

    public int getLength()
    {
	return length;
    }

    public int getWidth()
    {
	return width;
    }

    // The draw function provided below assumes that the Shape is
    // rectangular in shape. If any subclasses have a different kind of
    // shape, then the draw function below would have to be overridden.
    public void draw()
    {
	for (int i = 0; i < length; i++)
	{
	    for (int j = 0; j < width; j++)
	    {
		System.out.print("* ");
	    }
	    System.out.println();
	}

	System.out.println();
    }
}
