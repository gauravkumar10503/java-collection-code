package linkedlist_collection;
import java.util.*;
public class Merge_Two_Linkedlist
{
	public static void main(String []args)
	{
		LinkedList<Integer> li1=new LinkedList<>(List.of(1,3,5));
		LinkedList<Integer> li2=new LinkedList<>(List.of(2,4,6));
		
		li1.addAll(li2);
		Collections.sort(li1);
		System.out.println(li1);
	}
}
