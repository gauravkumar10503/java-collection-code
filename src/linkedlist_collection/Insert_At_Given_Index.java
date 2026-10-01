package linkedlist_collection;
import java.util.*;
public class Insert_At_Given_Index 
{
	public static void main(String []args)
	{
		LinkedList<Integer> in=new LinkedList<>(List.of(1,2,3,4,5,7));
		System.out.println("Original linkedlist :- "+in);
		
		in.add(5,6);
		System.out.println("New Linkedlist :- "+in);
	}
}
