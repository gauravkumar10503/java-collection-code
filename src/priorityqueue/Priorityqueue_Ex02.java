package priorityqueue;

import java.util.*;
public class Priorityqueue_Ex02 
{
	public static void main(String []args)
	{
		PriorityQueue ex2=new PriorityQueue(15,new Comparator2());
		ex2.offer("a");
		ex2.offer("z");
		ex2.offer("g");
		ex2.offer("u");
		System.out.println(ex2);
	}
}

class Comparator2 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=(String)o1;
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}