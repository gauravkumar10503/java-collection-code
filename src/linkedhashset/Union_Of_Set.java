package linkedhashset;

import java.util.*;
public class Union_Of_Set 
{
	public static void main(String []args)
	{
		LinkedHashSet<Integer> lh1=new LinkedHashSet<>(List.of(2,4,5));
		LinkedHashSet<Integer> lh2=new LinkedHashSet<>(List.of(1,3,5));
		
		lh2.addAll(lh1);
		System.out.println(lh2);
	}
}
