package comparable_and_comparator;

import java.util.*;
public class Reversed_Method 
{
	public static void main(String []args)
	{
		List<String> rm=Arrays.asList("Apple","Banana","Fish");
		Comparator<String> cmp3=Comparator.comparingInt(String::length);
		rm.sort(cmp3.reversed());
		System.out.println(rm);
	}
}
