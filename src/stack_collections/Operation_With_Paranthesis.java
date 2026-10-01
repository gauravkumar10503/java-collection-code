package stack_collections;
import java.util.*;
public class Operation_With_Paranthesis 
{
	public static void main(String []args)
	{
		String s="( 1 + ( 2 * 3 ) ) ";
		String []a=s.trim().split(" ");
		
		Stack<Integer> value=new Stack<>();
		Stack<String> ops=new Stack<>();
		
		for(String element : a)
		{
			if(element.equals("("))
			{
				//do nothing
			}
			else if(element.matches("\\d+"))
			{
				value.push(Integer.parseInt(element));
			}
			else if(element.equals("+") || element.equals("-") || element.equals("/") || element.equals("*"))
			{
				ops.push(element);
			}
			else if(element.equals(")"))
			{
				int y=value.pop();
				int x=value.pop();
				String op=ops.pop();
				int res=0;
				switch(op)
				{
					case "+" : 
						res=x+y;
						break;
						
					case "-" :
						res=x-y;
						break;
						
					case "/" :
						res=x/y;
						break;
						
					case "*" :
						res=x*y;
						break;
				}
				value.push(res);
			}
		}
		System.out.println("Answer is : -"+value.pop());
	}
}
