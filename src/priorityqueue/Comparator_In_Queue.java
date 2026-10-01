package priorityqueue;

import java.util.*;
public class Comparator_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> cp=new PriorityQueue<>(Comparator.reverseOrder());
		System.out.println(cp.comparator()!=null);
	}
}
