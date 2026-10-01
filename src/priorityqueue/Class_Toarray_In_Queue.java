package priorityqueue;

import java.util.*;
public class Class_Toarray_In_Queue 
{
	public static void main(String []args)
	{
		PriorityQueue<String> pca=new PriorityQueue<>();
		pca.offer("Apple");
		pca.offer("Orange");
		String []a=pca.toArray(new String[1]);
		System.out.println(a[1]);
	}
}
