package week3.assignments.day1;
import week3.assignments.day1.MultipleLanguage;

//create class Automation  which extends the abstract class  MultipleLanguage
public class Automation extends MultipleLanguage 
{
public static void main(String[] args) 
{
//create object for class Automation and call all the methods from interfaces(Language, TestTool) and abstract class MultipleLanguage
	Automation auto = new Automation();
	auto.python();
	auto.java();
	auto.ruby();
	auto.selenium();
}
@Override
public void ruby()//implemented the abstract method from MultipleLanguage
{
	// TODO Auto-generated method stub
	System.out.println("Language 3: Ruby");
	
}

}
