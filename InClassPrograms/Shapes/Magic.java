/*
* This is the class that contains the main function that drives the
* execution of the entire program. You only need to compile and execute
* this file i.e. 
*	    javac Magic.java
*	    java Magic
* This class creates three objects of different shapes using the
* appropriate classes, and then calls each of their draw functions.
*/

public class Magic
{
    public static void main(String [] args)
    {
	Triangle t = new Triangle(5);
	Shape s = new Shape(3, 4);
	Square q = new Square(6);


	t.draw();
	s.draw();
	q.draw();
    }
}
