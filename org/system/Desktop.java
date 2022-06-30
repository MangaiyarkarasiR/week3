package org.system;

public class Desktop extends Computer//Class Desktop extends the class Computer
{
public void desktopSize() //created method desktopsize for the class Desktop
	{
		System.out.println("Desktop Size : 2*3*3");
	}
public static void main(String[] args) 
{
	Desktop d= new Desktop();//created object for the class Desktop
	d.computerModel();//Calling method from the class Computer 
	d.desktopSize();//Calling method from the class Desktop
}

}
