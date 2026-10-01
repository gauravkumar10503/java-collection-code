package priorityqueue;

import java.util.*;
public class Size_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> ps=new PriorityQueue<>();
		ps.offer(9);
		ps.offer(1);
		ps.offer(8);
		ps.offer(2);
		System.out.println(ps.size());
	}
}
