package comparable_and_comparator;

import java.util.*;
public class Comparable_Notes_Ex1 
{
	public static void main(String []args)
	{
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo("A"));
		//System.out.println("A".compareTo(new Integer(10)));
		System.out.println("A".compareTo(null));//give us exception
	}
}
