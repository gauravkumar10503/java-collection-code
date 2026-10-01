package priorityqueue;

import java.util.*;
public class Priorityqueue_Ex03 
{
	public static void main(String []args)
	{
		PriorityQueue<Task> pt=new PriorityQueue<>();
		pt.offer(new Task("Email",3));
		pt.offer(new Task("Accident",1));
		pt.offer(new Task("Checkup",2));
		//System.out.println(pt);
		
		while(!pt.isEmpty())
		{
			System.out.println(pt.poll());
		}
	}
}

class Task implements Comparable<Task>
{
	String names;
	int priority;
	public Task(String names,int priority)
	{
		this.names=names;
		this.priority=priority;
	}
	public String toString()
	{
		return "Name : "+names+", priority :"+priority;
	}
	public int compareTo(Task o)
	{
		return this.priority-o.priority;
	}
}
