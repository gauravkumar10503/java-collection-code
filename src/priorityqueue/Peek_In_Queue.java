package priorityqueue;

import java.util.*;
public class Peek_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> pp=new PriorityQueue<>();
		pp.offer(6);
		pp.offer(9);
		pp.offer(1);
		pp.offer(4);
		System.out.println(pp.peek());
	}
}
