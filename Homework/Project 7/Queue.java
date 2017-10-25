/* ***************************************************
 * Jacob Sennett
 * 10-24-17
 * Queue
 *
 * Program that contains functions for Queues
 *************************************************** */

 class Queue<Jacob> extends List
 {
     private List<Jacob> l;

     public void Queue()
     {
        l = new List<Jacob>();
     }

     public void Queue(Queue<Jacob> l)
     {
         l = new List<Jacob>(s.l);
     }

     public void Enqueue(Jacob data)
     {
            l.Last();
            l.InsertAfter(data);
     }

     public Jacob Dequeue()
     {
         l.First();
         Jacob x = l.GetValue();
         l.Remove();
     }

     public Jacob Peek()
     {
         l.First();
         return l.getData();
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

     public boolean Equals(Queue<Jacob> s)
     {
         return l.Equals(s.l);
     }

     public Queue Add(Queue<Jacob> s)
     {
         Stack<Jacob> temp = new Stack<Jacob>();
         temp.l = l.Add(s.l);
         return temp;
     }

     public String toString()
     {
         return l.toString();
     }
 }
