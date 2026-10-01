package stack_collections;

import java.util.*;
public class Input_Taken_By_User 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s1=new Stack<>();
		
		System.out.print("Enter the size of the stack :- ");
		int s=sc.nextInt();
		
		System.out.println("Enter the elements in stack :- ");
		for(int i=1;i<=s;i++)
		{
			int x=sc.nextInt();
			s1.push(x);
		}
		System.out.println("Elements in the stack :- "+s1);
		sc.close();
	}
}
