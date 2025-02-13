import java.util.Scanner;
class Voting
{
	public static void main(String[]args){
		int age;
			Scanner s=new Scanner(System.in);
			System.out.println("Eenter your age");
			age=s.nextInt();
			if(age>=18)
			{
			System.out.println("you can Vote");
			}
			else{
				System.out.println("you can not vote");
			}
	}
}