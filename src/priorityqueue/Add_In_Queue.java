package priorityqueue;

import java.util.*;
public class Add_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> an=new PriorityQueue<>();
		an.add(1);
		an.add(5);
		an.add(3);
		an.add(4);
		an.add(2);
		
		System.out.println(an);
	}
}
