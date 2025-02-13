import java.util.Scanner;
class Factorial
{
	public static void main(String[]args)
	{
		int no,f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		no=s.nextInt();
		for(int i=1;i<=no;i++)
		{
			f=f*i;
		}
	System.out.println("factorial"+f);
	}
}