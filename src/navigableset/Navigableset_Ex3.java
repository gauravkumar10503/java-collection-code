package navigableset;

import java.util.*;
public class Navigableset_Ex3 
{
	public static void main(String []args)
	{
		NavigableSet<Integer> e=new TreeSet<>(List.of(10,20,30,40,50,60,70));
		System.out.println("Headset(30,true) : "+e.headSet(30,true));
		//it will return before 30 value 
		
		System.out.println("Tailset(30,false) : "+e.tailSet(30,false));
		//it will return 30 and after 30 value
		
		System.out.println("Subset(20,true,50,false : "+e.subSet(20,true,50,false));
		//it will return value between 20 and 50
	}
}
