package week3.assignments.day1;

//create abstract class as MultipleLanguage which implements interfaces language and TestTool
public abstract class MultipleLanguage implements Language,TestTool
{
	public void python()//implemented method Python for class MultipleLanguage
	{
		System.out.println("Language 1 : Python");
	}
	public void java() //implemented methods from language
	{
		// TODO Auto-generated method stub
		System.out.println("Language 2 : Java");
	}
	public void selenium() //implemented method from TestTool
	{
		// TODO Auto-generated method stub
		System.out.println("TestTool : Selenium");
	}
	public abstract void ruby();//unimplemented method  ruby for class  MultipleLanguage
	
}
