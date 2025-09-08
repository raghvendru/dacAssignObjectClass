// Queue (with Integer values)
//Problem Statement:
//Simulate a ticket booking system where customers are represented by their token numbers (integers). Perform the following:
//1.	Enqueue 5 customer tokens into the queue.
//2.	Dequeue the first 2 customers and display them.
//3.	Peek at the next customer in line without removing.
//4.	Check if the queue is empty.

package Assign6Collection;

import java.util.*;
public class QueueExample {
public static void main(String[] args) {
	 Queue<Integer> queue = new LinkedList<>();
     queue.add(101);
     queue.add(102);
     queue.add(103);
     queue.add(104);
     queue.add(105);
     System.out.println("Initial Queue" + queue);
     
     
     System.out.println("1st ele after poll " + queue.poll()); 
     System.out.println("2nd ele after poll " + queue.poll());
     System.out.println("Queue after polling : " + queue);
     System.out.println("Next customer in line: " + queue.peek()); 
     if (queue.isEmpty()) {
         System.out.println("No customers in the queue.");
     } else {
         System.out.println("Customers still waiting: " + queue);
     }
 }
}

}
