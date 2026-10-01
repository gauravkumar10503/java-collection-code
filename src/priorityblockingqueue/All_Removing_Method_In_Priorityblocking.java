package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class All_Removing_Method_In_Priorityblocking 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<Integer> pbr=new PriorityBlockingQueue<>();
		pbr.put(2);
		pbr.put(9);
		pbr.put(3);
		pbr.put(6);
		
		System.out.println(pbr.peek());// it's only saw but not remove
		System.out.println("Using poll method :- "+pbr.poll());
		System.out.println("After using poll method :- "+pbr);
	}
}
