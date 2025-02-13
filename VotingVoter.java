import java.util.Scanner;
class VotingVoter
{
	public static void main(String[]args){
		int age;
			Scanner s=new Scanner(System.in);
			System.out.println("Eenter your age");
			age=s.nextInt();
			if(age>=18)
			{
				System.out.println("Do you have addhar card or VoterCard?(yes/no)");
				String ch=s.next();
				if(ch.equals("yes")){
				if(ch.equals("no"));
				
				System.out.println("you can Vote");
			}
				else{
				System.out.println("you can not vote");
			}
			}
	}
}