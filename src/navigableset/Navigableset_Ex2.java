package navigableset;

import java.util.*;
public class Navigableset_Ex2 
{
	public static void main(String []args)
	{
		NavigableSet<Integer> in=new TreeSet<>(Arrays.asList(10,20,30,40,50,60,70));
		System.out.println("Descending set : "+in.descendingSet());
		
		System.out.print("ListItrator : ");
		Iterator<Integer> it=in.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}
