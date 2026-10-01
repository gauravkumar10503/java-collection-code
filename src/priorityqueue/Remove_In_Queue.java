package priorityqueue;

import java.util.*;
public class Remove_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<Integer> pr=new PriorityQueue<>();
		pr.offer(3);
		pr.offer(9);
		pr.offer(1);
		pr.offer(2);
		System.out.println("Original queue :- "+pr);
		
		pr.remove();
		System.out.println("After using remove method :- "+pr);
		
		pr.remove();
		System.out.println("After using remove method :- "+pr);
		
		pr.remove();
		System.out.println("After using remove method :- "+pr);
		
		pr.remove();
		System.out.println("After using remove method :- "+pr);
	}
}
