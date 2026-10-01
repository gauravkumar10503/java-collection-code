package priorityqueue;

import java.util.*;
public class Poll_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> pp2=new PriorityQueue<>();
		pp2.offer(1);
		pp2.offer(4);
		pp2.offer(9);
		pp2.offer(7);
		pp2.offer(3);
		
		System.out.println("Original queue :- "+pp2);
		
		pp2.poll();
		System.out.println("After using poll method :- "+pp2);
		
		pp2.poll();
		System.out.println("After using poll method :- "+pp2);
		
		pp2.poll();
		System.out.println("After using poll method :- "+pp2);
	}
}
