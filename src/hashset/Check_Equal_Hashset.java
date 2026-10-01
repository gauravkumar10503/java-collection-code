package hashset;

import java.util.*;
public class Check_Equal_Hashset 
{
	public static void main(String []args)
	{
		HashSet<String> ch=new HashSet<>(Set.of("Apple","Orange"));
		HashSet<String> ch2=new HashSet<>(Set.of("Apple","Orange"));
		
		
		System.out.println("Set equal ? "+ch.equals(ch2));
	}
}
