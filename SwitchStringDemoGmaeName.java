import java.util.*;
class SwitchStringDemoGmaeName
{
	public static void main(String[]args)
	{
	String gamename;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your favourite game name");
	gamename=s.next();
	switch(gamename)
	{
		case "Cricket":System.out.println("Dhoni,Rohit,Kohali,Hardik,Jasprit are Players");
			   break;
		case "Kabaddi":System.out.println("Rohit,Rajan,Raushan,Mohit,Laddu are Players");
			   break;
		case "Hookey":System.out.println("Dilli,Arun,Deepak,Mintu,Mithu are Hookey Players");
			   break;
		case "HollyBall":System.out.println("Raghu,Yash,Sagar,Sahid are Palyer");
				break;
		default: System.out.println("I Am Not Knowing About This game");
               break;		
	}
	}
}