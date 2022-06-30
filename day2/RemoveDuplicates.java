package week3.assignments.day2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates 
{
public static void main(String[] args) 
{
	ArrayList <String> list = new ArrayList<String>();//declare new String array List
//	Add elements to an array list as below	
	list.add("We");
	list.add("learn");
	list.add("java");
	list.add("as");
	list.add("part");
	list.add("of");
	list.add("java");
	list.add("sessions");
	list.add("in");
	list.add("java");
	list.add("week1");
	
	System.out.println("original List "+list);//print the list elements
	for(int i=0;i<list.size()-1-1;i++)// for checking duplicates outer loops needs to be iterated  from 'first element'to element before the last element of an array list 
	{  		
		String s1=list.get(i);//get the value of an array list and store it in a string variable
		for(int j=i+1;j<list.size();j++) //iterate through the list from i+1 to last element of an array list
		{
			int count=0; //initialise count variable as 0 for each iteration of inner loop
			String s2=list.get(j);//get the value of an array List and store it String variable 
			if(s1.equals(s2)) //if both the strings are equal then increase the count variable 
			{
				count++;		
			}					
		if(count>0)//condition to check the count variable is >0
		{
			list.remove(j);//remove the duplicated element of an array list if count >0
		}
		}		
	}
	System.out.println("List without Duplicates "+list);//print the list without duplicates
		
}
	

}
