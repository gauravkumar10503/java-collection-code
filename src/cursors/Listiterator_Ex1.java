package cursors;

import java.util.*;
public class Listiterator_Ex1 
{
	public static void main(String []args)
	{
		LinkedList<Integer> list1=new LinkedList<>(List.of(10,7,24,15,42,9,6));
		ListIterator<Integer> itr=list1.listIterator();
		while(itr.hasNext())
		{
			Integer next=itr.next();
			if(next%2==0)
			{
				itr.set(next/2);
			}
		}
		System.out.println("Forword :- "+list1);
		System.out.print("Reverse :- ");
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" ");
		}
	}
}
