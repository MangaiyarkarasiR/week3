package week3.assignments.day2;
import java.util.HashMap;
import java.util.Set;

public class FindMostDuplicate 
{
	public static void main(String[] args) 
	{
		//declare the String Input as below
		String input="abbaba";
		//convert the input string to character array 
		char[] arr=input.toCharArray();
		//create a new Hash map with Character as key and Integer as value
		HashMap<Character, Integer> hashMap = new HashMap<Character,Integer>();
		//loop the array from first element to last element of the array
		for (int i=0;i<arr.length;i++)
		{
			if(hashMap.containsKey(arr[i])==false)//check if the map already contains the element of an array
				hashMap.put(arr[i], 1);// if the element of an array is not present in map , add the element to the map as key and 1 as value 
			else
			{
				System.out.println("The first most duplicated character is " +arr[i]);//if the element of an array if already present in the map , then print it asfirst most duplicated character
				break;//break the iteration
			}
		
		}	
}
}
