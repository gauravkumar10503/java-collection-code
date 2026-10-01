package linkedlist_collection;
import java.util.*;
public class Remove_Last_Element 
{
	public static void main(String []args)
	{
		LinkedList<Integer> dl2=new LinkedList<>(List.of(1,2,3,4,5,6));
		System.out.println("Original linkedlist :- "+dl2);
		
		dl2.removeLast();
		System.out.println("New linkedlist :- "+dl2);
	}
}
