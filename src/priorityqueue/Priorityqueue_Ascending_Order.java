package priorityqueue;

import java.util.*;
public class Priorityqueue_Ascending_Order 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> pa=new PriorityQueue<>(new Mycomparator());
		pa.add(3);
		pa.add(1);
		pa.add(5);
		pa.add(2);
		pa.add(6);
		pa.add(6);
		Iterator itr=pa.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
			itr.remove();
		}
		
	}
}

class Mycomparator implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		return o1-o2;
	}
}
