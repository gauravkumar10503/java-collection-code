package priorityqueue;

import java.util.*;
public class Priorityqueue_Ex1 
{
	public static void main(String []args)
	{
		//here null is not allowed but duplicate is allowed
		PriorityQueue<Integer> pq=new  PriorityQueue<>();
		pq.add(3);
		pq.add(1);
		pq.add(5);
		pq.add(6);
		pq.add(6);
		System.out.println(pq);
	}
}
