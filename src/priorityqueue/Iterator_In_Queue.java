package priorityqueue;

import java.util.*;
public class Iterator_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> pi=new PriorityQueue<>();
		pi.offer(2);
		pi.offer(9);
		pi.offer(5);
		pi.offer(0);
		
		for(Integer i : pi)
		{
			System.out.print(i+" ");
		}
	}
}
