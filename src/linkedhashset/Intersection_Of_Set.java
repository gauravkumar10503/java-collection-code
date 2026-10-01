package linkedhashset;

import java.util.*;
public class Intersection_Of_Set 
{
	public static void main(String []args)
	{
		LinkedHashSet<Integer> il1=new LinkedHashSet<>(List.of(1,2,3));
		LinkedHashSet<Integer> il2=new LinkedHashSet<>(List.of(3,4,5));
		il1.retainAll(il2);
		System.out.println(il1);
	}
}
