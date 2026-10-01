package linkedlist_collection;
import java.util.*;
public class Remove_Duplicate_From_LinkedList 
{
	public static void main(String []args)
	{
		LinkedList<Integer> li1=new LinkedList<>(List.of(2,4,5,6,4,2));
		LinkedList<Integer> li2=new LinkedList<>();
		for(int i=0;i<=li1.size()-1;i++)
		{
			if(li2.contains(li1.get(i))==false)
			{
				li2.add(li1.get(i));
			}
		}
		System.out.println(li2);
	}
}
