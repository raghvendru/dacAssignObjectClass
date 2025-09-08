//Stack (with Integer values)
//Problem Statement:
//Implement a stack to store a series of integer values representing daily temperatures. Perform the following:
//1.	Push 5 temperature values onto the stack.
//2.	Pop the top 2 values and display them.
//3.	Peek at the current top element without removing it.
//4.	Check if the stack is empty.
package Assign6Collection;
import java.util.*;
public class StackExample {
public static void main(String[] args) {
	Stack<Integer> st = new Stack<>();
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	st.push(5);
	
	System.out.println(st);
	st.pop();
	st.pop();
	System.out.println(st);
	
	System.out.println(st.peek());
	
	System.out.println(st.isEmpty());
}
}
