package priorityqueue;

import java.util.*;
public class Contains_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> pc=new PriorityQueue<>();
		pc.offer(2);
		pc.offer(8);
		pc.offer(7);
		pc.offer(5);
		pc.offer(3);
		System.out.println("Original queue :- "+pc);
		
		System.out.println(pc.contains(7));
		System.out.println(pc.contains(100));
	}
}
