package treeset;

import java.util.*;
public class Treeset_Ex1 
{
	public static void main(String []args)
	{
		TreeSet t1=new TreeSet();
		t1.add("A");
		t1.add("a");
		t1.add("B");
		t1.add("Z");
		
		//t1.add(new Integer(10)); ClassCastException
		//t1.add(null); NullPointerException
		System.out.println(t1);
		
	}
}
