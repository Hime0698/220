/* ***************************************************
 * Jacob Sennett
 * 10-8-17
 * List
 *
 * Program that contains functions called by ListTest with a linked list backend
 *************************************************** */

// the Node class
class Node
{
	private int data;
	private Node link;

	// constructor
	public Node()
	{
		this.data = 0;
		this.link = null;
	}

	// accessor and mutator for the data component
	public int getData()
	{
		return this.data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	// accessor and mutator for the link component
	public Node getLink()
	{
		return this.link;
	}

	public void setLink(Node link)
	{
		this.link = link;
	}
}

// the List class
public class List
{
	public static final int MAX_SIZE = 50;

	private Node head;
	private Node tail;
	private Node curr;
	private int num_items;

	// constructor
	// remember that an empty list has a "size" of -1 and its "position" is at -1
	public List()
	{
		head = null;
		curr = tail = head;
		num_items = 0;
	}

	// copy constructor
	// clones the list l and sets the last element as the current
	public List(List l)
	{
	}

	// navigates to the beginning of the list
	public void First()
	{
		curr = head;
	}

	// navigates to the end of the list
	// the end of the list is at the last valid item in the list
	public void Last()
	{
		curr = tail;
	}

	// navigates to the specified element (0-index)
	// this should not be possible for an empty list
	// this should not be possible for invalid positions
	public void SetPos(int pos)
	{
		while(!IsEmpty())
		{
			curr = head;
			for(int i = 0; i < pos; i++)
			{
				curr = curr.getLink();
			}
		}
	}


	// navigates to the previous element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Prev()
	{
		if(!IsEmpty())
		{
			int a = GetPos()-1;
			SetPos(a);
		}
	}

	// navigates to the next element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Next()
	{
		if(!IsEmpty())
			curr = curr.getLink();
	}

	// returns the location of the current element (or -1)
	public int GetPos()
	{
		if(IsEmpty())
			return -1;
		else
		{
			int pos = -1;
			Node a = head;
			while(a != curr)
			{
				pos++;
				a = a.getLink();
			}
			return pos;
		}
	}

	// returns the value of the current element (or -1)
	public int GetValue()
	{
		if (IsEmpty())
			return -1;
		return curr.getData();
	}

	// returns the size of the list
	// size does not imply capacity
	public int GetSize()
	{
		return num_items -1;
	}

	// inserts an item before the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertBefore(int data)
	{
		if(!IsFull())
		{
			Prev();
			InsertAfter(data);
			Next();
			Next();
		}
	}

	// inserts an item after the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertAfter(int data)
	{
		if(!IsFull())
		{
			if(curr == tail)
			{
				if(head == null)
				{
					head = new Node();
					curr = tail = head;
					curr.setData(data);
					num_items++;
				}
				Node p = new Node();
				curr.setLink(p);
				p.setData(data);
				curr = p;
				tail = curr;
				num_items++;

			}
			else
			{
				Node p, q;
				p = new Node();
				p.setData(data);
				q = curr.getLink();
				curr.setLink(p);
				p.setLink(q);
				curr = p;
				num_items++;
			}
		}
	}

	// removes the current element (collapsing the list)
	// this should not be possible for an empty list
	public void Remove()
	{
		   
	}

	// replaces the value of the current element with the specified value
	// this should not be possible for an empty list
	public void Replace(int data)
	{
		if(!IsEmpty())
			curr.setData(data);
	}

	// returns if the list is empty
	public boolean IsEmpty()
	{
		if(num_items == 0)
			return true;
		return false;
	}

	// returns if the list is full
	public boolean IsFull()
	{
		if(GetSize() <= MAX_SIZE)
			return false;
		return true;
	}

	// returns if two lists are equal (by value)
	public boolean Equals(List l)
	{
		return true;
	}

	// returns the concatenation of two lists
	// l should not be modified
	// l should be concatenated to the end of *this
	// the returned list should not exceed MAX_SIZE elements
	// the last element of the new list is the current
//	public List Add(List l)
	{
	}

	// returns a string representation of the entire list (e.g., 1 2 3 4 5)
	// the string "NULL" should be returned for an empty list
public String toString()
	{
		if(!IsEmpty())
		{
			Node a = head;
			String s = "";
			while(a.getLink() != null)
			{

				s += Integer.toString(a.getData()) + " ";
				a = a.getLink();
			}
			return s;
		}
		return "NULL";
	}
}
