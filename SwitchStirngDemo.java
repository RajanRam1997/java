import java.util.*;
class SwitchStirngDemo
{
	public static void main(String[]args)
	{
	String moviename;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your favourite movie name");
	moviename=s.next();
	switch(moviename){
		case "asuran":System.out.println("Dhanush Shivasamy,Manju Warrier are Actors");
			   break;
		case "Shallar":System.out.println("Pravash,Ananya Panday are Actors");
			   break;
		case "Kaithi":System.out.println("Dilli,Arun Das,Deepthi are Actors");
			   break;
		default: System.out.println("I Am Not Knowing About This Movie");
               break;		
	}
	}
}