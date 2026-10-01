package linkedlist_collection;
import java.util.*;
public class Delete_Last_Element 
{
	public static void main(String []args)
	{
		LinkedList<Integer> dtl=new LinkedList<>(List.of(3,4,5,6,7,8));
		System.out.println("Original linkedlist :- "+dtl);
		
		dtl.removeLast();
		System.out.println("New linkedlist :- "+dtl);
	}
}
