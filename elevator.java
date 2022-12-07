import java.util.*;
public class elevator{
public static void main(String []args){
Scanner mom = new Scanner(System.in);
System.out.println("G  1\n2  3\n4  5\n<|>  R  >|<");
String button = "";
System.out.print("Please push a button on the board of elevator: ");
String option = mom.next().toUpperCase();
if(option.equals("G"))
{
	while(!(button.equals(">|<")))
	{
		System.out.print("Please click >|< button to close the door: ");
	    button = mom.next();
	    if(button.equals(">|<"))
	    System.out.println("Now the door is closed and you get Ground Floor");
	}
}
else if(option.equals("1"))
{
	while(!(button.equals(">|<")))
	{
		System.out.print("Please click >|< button to close the door: ");
	    button = mom.next();
	    if(button.equals(">|<"))
	    System.out.println("Now the door is closed and you get First Floor");
	}
}
else if(option.equals("2"))
{
	while(!(button.equals(">|<")))
	{
		System.out.print("Please click >|< button to close the door: ");
	    button = mom.next();
	    if(button.equals(">|<"))
	    System.out.println("Now the door is closed and you get Second Floor");
	}
}
else if(option.equals("3"))
{
	while(!(button.equals(">|<")))
	{
		System.out.print("Please click >|< button to close the door: ");
	    button = mom.next();
	    if(button.equals(">|<"))
	    System.out.println("Now the door is closed and you get Third Floor");
	}
}
else if(option.equals("4"))
{
	while(!(button.equals(">|<")))
	{
		System.out.print("Please click >|< button to close the door: ");
	    button = mom.next();
	    if(button.equals(">|<"))
	    System.out.println("Now the door is closed and you get Fourth Floor");
	}
}
else if(option.equals("5"))
{
	while(!(button.equals(">|<")))
	{
		System.out.print("Please click >|< button to close the door: ");
	    button = mom.next();
	    if(button.equals(">|<"))
	    System.out.println("Now the door is closed and you get Fifth Floor");
	}
}
else
{
	System.out.println("please enter a right option");
}
}
}































