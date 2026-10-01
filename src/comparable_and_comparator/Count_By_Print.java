package comparable_and_comparator;

import java.util.*;
public class Count_By_Print 
{
	public static void main(String []args)
	{
		ArrayList<String> as=new ArrayList<>();
		
		as.add("T20ark11eshw23ar");
		as.add("A1nku");
		as.add("R18it2u");
		as.add("G7aur8v");
		Collections.sort(as,new Mycomparator9());
		System.out.println(as);
	}
}

class Mycomparator9 implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		int c1=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				c1++;
			}
		}
		int c2=0;
		for(int i=0;i<=s2.length()-1;i++)
		{
			if(s2.charAt(i)>='0' && s2.charAt(i)<='9')
			{
				c2++;
			}
		}
		return c1-c2;
	}
}
