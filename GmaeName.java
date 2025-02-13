import java.util.*;
class SwitchStringDemoGmaeName
{
	public static void main(String[]args)
	{
	String playername;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your favourite player name");
	playername=s.next();
	switch(playername)
	{
		case "Cricket":System.out.println("Dhoni,Rohit,Kohali,Hardik,Jasprit are Cricket Players");
			   break;
		case "Kabaddi":System.out.println("Rohit,Rajan,Raushan,Mohit,Laddu are Kabaddi Players");
			   break;
		case "Hookey":System.out.println("Dilli,Arun,Deepak,Mintu,Mithu are Hookey Players");
			   break;
		case "HollyBall":System.out.println("Raghu,Yash,Sagar,Sahid are HOllyBall Palyer");
				break;
		default: System.out.println("I Am Not Knowing About This game");
               break;		
	}
	}
}