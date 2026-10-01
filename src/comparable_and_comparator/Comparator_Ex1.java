package comparable_and_comparator;

import java.util.*;
public class Comparator_Ex1 
{
	public static void main(String []args)
	{
		TreeSet<String> t=new TreeSet<>(new Mycomparator());
		t.add("D");
		t.add("A");
		t.add("T");
		t.add("Z");
		t.add("B");
		System.out.println(t);
	}
}

class Mycomparator implements Comparator<String>
{
	public int compare(String o1,String o2)
	{
		return o2.compareTo(o1);
	}
}
