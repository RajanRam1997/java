import java.util.Scanner;
class SimpleInterestDouble{
	public static void main(String[]args){
		double p,r,t;
			Scanner s=new Scanner(System.in);
				System.out.println("Enter The Principal:");
				p=s.nextDouble();
					System.out.println("Enter The Rate of interest:");
					r=s.nextDouble();
						System.out.println("Enter The Time Period:");
						t=s.nextDouble();
		double si;
				si=(r*t*p)/100;
					System.out.println("The Simple Interest:"+si);
	}
}