package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Drainto_And_Clear_Method 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<Integer> cdp=new PriorityBlockingQueue<>();
		cdp.offer(8);
		cdp.offer(3);
		cdp.offer(1);
		cdp.offer(6);
		System.out.println("Original queue :- "+cdp);
		
		//Using drainTo to transfer elements to a list
		List<Integer> li=new ArrayList<>();
		cdp.drainTo(li);
		System.out.println("List after drainto :- "+li);
		System.out.println("Queue before drainto :- "+cdp);
		
		cdp.clear();
		System.out.println("Queue after clear :- "+cdp);
	}
}
