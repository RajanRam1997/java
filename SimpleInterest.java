import java.util.Scanner;
class SimpleInterest
{
	public static void main(String[]args){
		float p,r,t;
			Scanner s=new Scanner(System.in);
				System.out.println("Enter The Principal:");
				p=s.nextFloat();
					System.out.println("Enter The Rate of interest:");
					r=s.nextFloat();
						System.out.println("Enter The Time Period:");
						t=s.nextFloat();
		float si;
				si=(r*t*p)/100;
					System.out.println("The Simple Interest:"+si);
	}
}