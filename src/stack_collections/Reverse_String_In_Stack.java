package stack_collections;

import java.util.*;
public class Reverse_String_In_Stack
{
	 public static void main(String []args)
	 {
		 //we're creating a sting hello
		 String s="Hello";
		 
		 //here we're creating stack
		 Stack<Character> stack=new Stack<>();
		 
		 //here we're convert string to character with the help of toCharArray
		 for(Character ch : s.toCharArray())
		 {
			 stack.push(ch);
		 }
		 
		 //Here we're creating StringBulider
		 StringBuilder sb=new StringBuilder();
		 
		 //here we're removing from stack and adding in StringBulider sb
		 while(!stack.isEmpty())
		 {
			 sb.append(stack.pop());
		 }
		 System.out.println(sb);
	 }
}
