package navigableset;

import java.util.*;
public class Navigableset_Ex4 
{
	public static void main(String []args)
	{
		NavigableSet<Integer>ex=new TreeSet<>(List.of(10,20,30,40,50,60,70));
		System.out.println("Pollfirst :- "+ex.pollFirst());
		//it will return the first element of the navigableset
		
		System.out.println("Polllast :- "+ex.pollLast());
		//it will return the last element of the naviagableset and remove from the naviagableset
		
		System.out.println("Set poll after last :- "+ex);
	}
}
