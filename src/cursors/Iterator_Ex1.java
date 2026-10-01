package cursors;

import java.util.*;
public class Iterator_Ex1 
{
	public static void main(String []args)
	{
		//here we're creating linkedlist
		LinkedList<Integer> list=new LinkedList<>(List.of(12,45,34,7,9));
		
		//here we're are checking linkedlist is empty or not 
		if(list.isEmpty())
		{
			return;
		}
		else
		{
			//here we're inserting the element of linkedlist in int min
			int min=list.getFirst();
			//int min=Integer.MAX_VALUE; we can write this only i will give same answer
			
			//here we're inserting the element of linkedlist in int max
			int max=list.getFirst();
			//int max=Integer.MIN_VALUE;
			
			Iterator<Integer> itr=list.iterator();
			while(itr.hasNext())
			{
				Integer next=itr.next();
				if(next<min)
				{
					min=next;
				}
				if(next>max)
				{
					max=next;
				}
			}
			System.out.println("Minimum value in the linkedlist is :- "+min);
			System.out.println("Maximum value in the linkedlist is :- "+max);
		}
	}
}
