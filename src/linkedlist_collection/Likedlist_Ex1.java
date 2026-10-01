package linkedlist_collection;

import java.util.*;
public class Likedlist_Ex1
{
	public static void main(String []args)
	{
		LinkedList<Integer> li=new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.remove();//by default remove first value in linkedlist
		li.removeLast();
		System.out.println(li);
	}
}
