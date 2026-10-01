package linkedlist_collection;
import java.util.*;
public class Remove_All_Occurence 
{
	public static void main(String []args)
	{
		LinkedList<String> li=new LinkedList<>(List.of("Arun","Varun","Kiran","Varun"));
		String value="Varun";
		for(int i=0;i<=li.size()-1;i++)
		{
			if(li.get(i).equals(value))
			{
				li.remove();
			}
		}
		System.out.println(li);
	}
}
