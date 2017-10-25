/* ***************************************************
 * Jacob Sennett
 * 10-24-17
 * Queue
 *
 * Program that contains functions for Queues
 *************************************************** */

 class Queue<Jacob> extends List
 {
     public void Queue()
     {
        List();
     }

     public void Queue(Queue<Jacob> l)
     {
         List(l)
     }

     public void Enqueue(Jacob data)
     {
            Last();
            InsertAfter(data);
     }

     public Jacob Dequeue()
     {
         First();
         Jacob x = GetValue();
         Remove();
     }

     public Jacob Peek()
     {
         First();
         return getData();
     }

     public int Size()
     {
         Size();
     }

     public boolean IsEmpty()
     {
         IsEmpty();
     }

     public boolean Equals(Queue<Jacob> l)
     {
         Equals(l);
     }

     public Queue Add(Queue<Jacob> l)
     {
         Add(l)
     }

     public String toString()
     {
         toString();
     }
 }
