package week3.assignments.day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargestInList 
{
public static void main(String[] args) 
{
	//create list as list1
	ArrayList <Integer> list1 = new ArrayList<Integer>();
	//add values to the list 
 	list1.add(3);	
	list1.add(2);	
	list1.add(11);	
	list1.add(4);
	list1.add(6);
	list1.add(7);
	//Sort the list in ascending order 
	Collections.sort(list1);
	System.out.println("Sorted List :"+list1);//print the sorted list
	//to get the second largest value in a list ,find the size of the list and get value in the index(size-2) 
	System.out.println("Second Largest Element in a List :"+list1.get(list1.size()-2));
}
}
