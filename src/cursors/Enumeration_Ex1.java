package cursors;

import java.util.*;
public class Enumeration_Ex1 
{
	public static void main(String []args)
	{
		Vector<Integer> v=new Vector<>(List.of(12,34,56,78,91));
		int sum=0;
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			sum=sum+(int)e.nextElement();
		}
		System.out.println("Sum of elements :- "+sum);
		System.out.println("Average of given elements is :- "+sum/v.size());
		
	}
}
