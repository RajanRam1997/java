import java.util.Scanner;
class Plaindrome
{
	public static void main(String[]args)
	{
		int no;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Number");
		no=s.nextInt();
		int temp=0;
		int rev=0,d;
		while(no>0)
		{
			d=no%10; //operator always gives the last digit of the number.
			rev=rev*10+d; //*10 will increment place value by 10.
			no=no/10; //no/10 always give to the number removing last digit.
		}
		if(rev==temp){
			System.out.println("The number is plaindrome");
		}
		else{
			System.out.println("The number is not plaindrome");
		}
			
	}
}