package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Insert_And_Print_In_Pbq 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<Integer> ip=new PriorityBlockingQueue<>();
		ip.offer(88);
		ip.offer(2);
		ip.offer(5);
		ip.offer(60);
		
		while(!ip.isEmpty())
		{
			System.out.print(ip.poll()+" ");
		}
	}
}
