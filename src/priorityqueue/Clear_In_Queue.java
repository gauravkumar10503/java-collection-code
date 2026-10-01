package priorityqueue;

import java.util.*;
public class Clear_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> pc2=new PriorityQueue<>();
		pc2.offer(3);
		pc2.offer(9);
		pc2.offer(1);
		pc2.offer(5);
		System.out.println("Original queue :- "+pc2);
		
		pc2.clear();
		System.out.println("After using clear method :- "+pc2);
	}
}
