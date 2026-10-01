package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.*;
public class All_Insert_Method_In_Priorityblocking 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<Integer> pbq=new PriorityBlockingQueue<>();
		pbq.add(10);
		pbq.offer(20);
		pbq.put(30);
		System.out.println(pbq);
		
	}
}
