////LinkedList (with Integer values)
//Problem Statement:
//Create a task manager using a linked list where each integer represents a task priority. Perform the following:
//1.	Add 5 tasks (integers) into the list.
//2.	Insert a new task at the beginning and another at the end.
//3.	Remove a task from the middle.
//4.	Display the first and last task using getFirst() and getLast().
//5.	Check if a specific task priority exists in the list.

package Assign6Collection;
import java.util.*;
public class LinkedListExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> ll = new LinkedList<>();
	
	ll.add(1);
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(5);
	
	System.out.println(ll);
	
	ll.addFirst(100);
	ll.addLast(200);
	
	System.out.println("after adding first and last els ll will be: "+ll);
	ll.remove(3);
	System.out.println("after removing middle :" + ll);{
		System.out.println("1st ele is : " +ll.getFirst());
		System.out.println("last ele is : " +ll.getLast());
	}
	
	System.out.println("please enter priority task :");
	int n = sc.nextInt();
	if(ll.contains(n)) {
		System.out.println("yes priority task found");
	}else {
		System.out.println("not found");
	}
	
			
}
}
