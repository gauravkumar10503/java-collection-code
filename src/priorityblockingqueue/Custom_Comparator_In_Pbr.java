package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Custom_Comparator_In_Pbr 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<String> cp=new PriorityBlockingQueue<>(10,Comparator.reverseOrder());
		cp.offer("Orange");
		cp.offer("Banana");
		cp.offer("Cherry");
		cp.offer("Apple");
		
		while(!cp.isEmpty())
		{
			System.out.print(cp.poll()+" ");
		}
	}
}
