package priorityqueue;

import java.util.*;
public class Priorityqueue_Ex01 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> po=new PriorityQueue<>();
		System.out.println(po.peek());
		
		//System.out.println(po.element()); give NoSuchElementException 
		
		for(int i=0;i<=10;i++)
		{
			po.offer(i);
		}
		System.out.println(po);
		System.out.println(po.peek());
		System.out.println(po.poll());
		System.out.println(po);
	}
}
