package linkedhashset;

import java.util.*;
public class Linkedhashset_Ex1 
{
	public static void main(String []args)
	{
		LinkedHashSet h=new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add("Null");
		h.add(10);
		
		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}
