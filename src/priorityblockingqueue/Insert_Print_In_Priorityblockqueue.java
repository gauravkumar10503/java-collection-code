package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Insert_Print_In_Priorityblockqueue 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<Integer> ip=new PriorityBlockingQueue<>();
		ip.add(10);
		ip.add(5);
		ip.add(1);
		ip.add(9);
		
		while(!ip.isEmpty())
		{
			System.out.print(ip.poll()+" ");
		}
	}
}
