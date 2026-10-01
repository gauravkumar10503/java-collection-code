package cursors;

import java.util.*;
public class Arraylist_And_Listitrator 
{
	public static void main(String[]args)
	{
		ArrayList<String> as=new ArrayList<>(List.of("apple","to","banana","egg","sky","orange","fig"));
		System.out.println("Original list :- "+as);
		
		ListIterator<String> ls=as.listIterator();
		while(ls.hasNext())
		{
			String s=ls.next();
			if(s.length()<=3)
			{
				ls.remove();
				continue;
			}
			char ch=Character.toLowerCase(s.charAt(0));
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				ls.add(s.toUpperCase());
			}
		}
		System.out.println(as);
	}
}
