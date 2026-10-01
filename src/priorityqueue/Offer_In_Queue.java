package priorityqueue;

import java.util.*;
public class Offer_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<String> ps=new PriorityQueue<>();
		ps.offer("Apple");
		ps.offer("Orange");
		ps.offer("Cherry");
		ps.offer("Banana");
		System.out.println(ps);
	}
}
