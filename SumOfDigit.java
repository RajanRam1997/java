import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number :");
	int no=s.nextInt();
	int sum=0;
	while(no !=0){
	sum +=no%10;
	no=no/10;
	}
	System.out.println("The sum of the digits is:" + sum);
	}
}