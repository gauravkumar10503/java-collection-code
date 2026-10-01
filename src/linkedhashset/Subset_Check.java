package linkedhashset;

import java.util.*;
public class Subset_Check 
{
	public static void main(String []args)
	{
		LinkedHashSet<Integer> si=new LinkedHashSet<>(List.of(1,2,3,4));
		LinkedHashSet<Integer> si2=new LinkedHashSet<>(List.of(2,3));
		System.out.println("Subset or not ? "+si.containsAll(si2));
	}
}
