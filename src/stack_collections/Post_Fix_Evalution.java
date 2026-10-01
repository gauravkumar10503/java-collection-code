package stack_collections;
import java.util.*;
public class Post_Fix_Evalution 
{
	public static void main(String []args)
	{
		String s="2 3 1 * + 9 -";
		String []a=s.trim().split(" ");
		int result=0;
		Stack<Integer> sta=new Stack<>();
		for(String i : a)
		{
			if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/"))
			{
				int y=sta.pop();
				int x=sta.pop();
				switch(i)
				{
					case "+" : result=x+y;
					break;
					
					case "-" : result=x-y;
					break;
					
					case "*" : result=x*y;
					break;
					
					case "/" : result=x/y;
					break;
				}
				sta.push(result);
			}
			else
			{
				sta.push(Integer.parseInt(i));
			}
		}
		System.out.println("Answer :- "+sta.peek());
	}
}
