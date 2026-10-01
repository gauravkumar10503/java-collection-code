package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Poll_Vs_Take_Method 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<Integer> ptm=new PriorityBlockingQueue<>();
		ptm.offer(99);
		ptm.offer(4);
		ptm.offer(111);
		ptm.offer(59);
		
		System.out.println("Using Poll method :- "+ptm.poll()); //remove 4 from queue
		try
		{
			System.out.println(ptm.take());
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
