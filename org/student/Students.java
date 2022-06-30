package org.student;

public class Students 
{
public static void main(String[] args)
{
	Students stu=new Students();//create object for the class Students
	//call all the methods from class Students
	stu.getStudentInfo(515621);
	stu.getStudentInfo(515621, "Mangai");
	stu.getStudentInfo("mangai@gmail.com", 9966337561l);
}
	public void getStudentInfo(int id)//method getStudentInfo by passing id 
	{
	}
	public void getStudentInfo(int id , String name)//method getStudentInfo by passing id  and name
	{
		System.out.println("Id :"+id+"\nName :"+name);//print id and name
	}
	public void getStudentInfo(String email , long phoneNumber)//method getStudentInfo by passing id  and name
	{
		System.out.println("Email : "+email+"\nPhone Number :"+phoneNumber);//print email and phonenumber
	}
}
