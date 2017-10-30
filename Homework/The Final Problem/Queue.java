/* ***************************************************
 * Jacob Sennett
 * 10-24-17
 * Queue
 *
 * Program that contains functions for Queues
 *************************************************** */

 class Queue<Jacob>
 {
     private List<Jacob> l;

     public Queue() //constructer for empty queue
     {
        l = new List<Jacob>();
     }

     public Queue(Queue<Jacob> s) // constructer to clone a queue
     {
         l = new List<Jacob>(s.l);
     }

     public void Enqueue(Jacob data) //adds the new data to the end of the queue
     {
            l.Last();
            l.InsertAfter(data);
     }

     public Jacob Dequeue() //reads the first item and removes it
     {
         l.First();
         Jacob x = l.GetValue();
         l.Remove();
         return x;
     }

     public Jacob Peek() // just resds the first item in the queue
     {
         l.First();
         return l.GetValue();
     }

     public int Size()
     {
         return l.GetSize();
     }

     public boolean IsEmpty()
     {
         return l.IsEmpty();
     }

     public boolean IsFull()
     {
         return l.IsFull();
     }

     public boolean Equals(Queue<Jacob> s) //checks to see if two queues are the same
     {
         return this.l.Equals(s.l);
     }

     public Queue<Jacob> Add(Queue<Jacob> s) //adds two queues together
     {
         Queue<Jacob> temp = new Queue<Jacob>();
         temp.l = l.Add(s.l);
         return temp;
     }

     public String toString()
     {
         return l.toString();
     }
 }
