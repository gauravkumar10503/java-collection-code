package hashset;

import java.util.*;
public class Check_Subset_Hashset 
{
	public static void main(String []args)
	{
		HashSet<String> hs=new HashSet<>(Set.of("Ritu","Tarkeshwar"));
		HashSet<String> hs2=new HashSet<>(Set.of("Anku","Gaurav","Ritu","Tarkeshwar"));
		
		boolean check=hs2.containsAll(hs);//bulit-in method
		System.out.println("Is hs is subset of hs2 :- "+check);
	}
}
