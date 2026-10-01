package priorityqueue;

import java.util.*;
public class Toarray_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<String> pa=new PriorityQueue<>();
		pa.offer("Gaurav");
		pa.offer("Anku");
		pa.offer("Ritu");
		pa.offer("Tarkeshwar");
		Object []arr=pa.toArray();
		System.out.println(arr.length);
	}
}
