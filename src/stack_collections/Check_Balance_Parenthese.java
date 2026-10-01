package stack_collections;

import java.util.*;
public class Check_Balance_Parenthese 
{
	public static void main(String []args)
	{
		String b="{[()()]}";
		boolean valid=true;
		Stack<Character> stacks=new Stack<>();
		
		for(int i=0;i<=b.length()-1;i++)
		{
			char ch=b.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(')
			{
				stacks.push(ch);
			}
			else
			{
				if(stacks.isEmpty())
				{
					valid=false;
					break;
				}
				char pop=stacks.pop();
				if((ch=='}' && pop!='{') || (ch==']' && pop!='[') || (ch==')' && pop!='('))
				{
					valid=false;
					break;
				}
			}
		}
		if(valid==true)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("not valid");
		}
	}
}
