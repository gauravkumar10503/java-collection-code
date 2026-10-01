package hashset;

import java.util.*;
public class Check_Duplicate_Hashset 
{
	public static void main(String []args)
	{
		HashSet<String> f=new HashSet<>();
		f.add("Apple");
		f.add("Banana");
		f.add("Banana");
		f.add("Orange");
		f.add("Cherry");
		
		System.out.println(f);
	}
}
