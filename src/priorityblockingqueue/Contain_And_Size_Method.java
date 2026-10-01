package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Contain_And_Size_Method 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<Integer> csp=new PriorityBlockingQueue<>();
		csp.offer(99);
		System.out.println("Queue now :- "+csp.size());
		
		csp.offer(5);
		System.out.println("After adding one more element in queue :- "+csp.size());
		
		System.out.println("check 40 is there or not ? "+csp.contains(40));
		
	}
}
