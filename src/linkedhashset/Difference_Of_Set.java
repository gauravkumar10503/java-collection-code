package linkedhashset;

import java.util.*;
public class Difference_Of_Set 
{
	public static void main(String []args)
	{
		LinkedHashSet<Integer> di=new LinkedHashSet<>(List.of(5,2,3));
		LinkedHashSet<Integer> di2=new LinkedHashSet<>(List.of(3,1,5));
		di.removeAll(di2);
		System.out.println(di);
	}
}
