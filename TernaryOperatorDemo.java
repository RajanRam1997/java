import java.util.Scanner;
class TernaryOperatorDemo
{
public static void main(String[]args){
int a,b;
	Scanner s=new Scanner(System.in);
		System.out.println("Enter any Two numbers");
			a=s.nextInt();
			b=s.nextInt();
				int max=a>b?a:b;
					System.out.println("Maximum:"+max);
}
}