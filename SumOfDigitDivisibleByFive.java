import java.util.Scanner;
class SumOfDigitDivisibleByFive
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number :");
		int no=s.nextInt();
		int sum=0;
		while(no>0)
		{   
			int digit =no % 10;
			if (digit % 5==0)
			{
				sum +=digit;
			}
			no=no/10;
			System.out.println("The sum of digits divisible by 5 is:" + sum);
		}
	}
	
}