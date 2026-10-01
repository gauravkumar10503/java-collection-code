package linkedlist_collection;
import java.util.*;
public class List_Rotation_LinkedList 
{
	public static void main(String []args)
	{
		LinkedList<Integer> lr=new LinkedList<>(List.of(10,20,30,40,50));
		int k=3;
		for(int i=1;i<=k;i++)
		{
			Integer lastElement=lr.getLast();
			lr.removeLast();
			lr.addFirst(lastElement);
		}
		System.out.println(lr);
	}
}
