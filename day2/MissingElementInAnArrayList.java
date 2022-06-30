package week3.assignments.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementInAnArrayList 
{
public static void main(String[] args) 
{
	//create list as list1
	ArrayList <Integer> list1 = new ArrayList<Integer>();
	//add values to the list 
 	list1.add(1);	
	list1.add(2);	
	list1.add(3);	
	list1.add(4);	
	list1.add(7);	
	list1.add(6);
	list1.add(8);
	Collections.sort(list1);//to find the missing element in list  , sort the list in ascending order
	System.out.println("Sorted List :  "+list1);//print the sorted list
	for(int i=1;i<list1.size();i++)//loop through the list form 1 to last element using size of the list
	{
		if(i!=list1.get(i-1))//compare the if loop variable is not equal to value of the list for each iteration  
		{
			System.out.println("Missing Element in an Array List : "+i);//print the missing  loop variable
			break;//break the loop iteration 
		}
	}
}
}
