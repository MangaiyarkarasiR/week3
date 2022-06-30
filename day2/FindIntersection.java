package week3.assignments.day2;

import java.util.ArrayList;

public class FindIntersection 
{
public static void main(String[] args) 
{
	//creating an empty list named list1
	ArrayList <Integer> list1 = new ArrayList<Integer>();
	//adding elements to the list1
	list1.add(3);	
	list1.add(2);	
	list1.add(11);	
	list1.add(4);	
	list1.add(6);	
	list1.add(7);	
	//creating an empty list named list2
	ArrayList <Integer> list2 = new ArrayList<Integer>();
	//	adding elements to the list1
	list2.add(1);	
	list2.add(2);	
	list2.add(8);	
	list2.add(4);	
	list2.add(9);	
	list2.add(7);
	//	to find the common values between 2 lists
	for(int i=0;i<list1.size();i++)//iterate through each element of list1
		for(int j=0;j<list2.size();j++)//within loop iterate through the  each element of list 2
		{
			if(list1.get(i)==list2.get(j))//get the values of both lists and compare if they are equal
			{
				System.out.println(list1.get(i));//print the value from any of the list 
			}
		}
	}
}

