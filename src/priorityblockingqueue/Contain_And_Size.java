package priorityblockingqueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Contain_And_Size 
{
	public static void main(String []args)
	{
		PriorityBlockingQueue<Integer> cst=new PriorityBlockingQueue<>();
		cst.offer(93);
		cst.offer(39);
		cst.offer(29);
		System.out.println("Is cst contain 44 ?"+cst.contains(44));
		System.out.println("Size :- "+cst.size());
	}
}
