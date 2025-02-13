//153= 1*1*1+5*5*5+3*3*3*=1+125+27=153
//441   = 
// the summation of cubes of each digit is as that number 
import java.util.Scanner;
class Armstrong
{
	public void armstrong(int no)
	{
		int sum=0,d,temp;
		temp=no;
		while(no>0){
			d=no%10;
			sum=sum+d*d*d;
			no=no/10;
		}
		if(temp==sum){
		System.out.println("The number is Armstrong:"+temp);
		}
		else{
		System.out.println("The number is not Armstrong");
		}
	}
	public static void main(String[]args)
	{
		int no;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Number");
		no=s.nextInt();
		Armstrong a1= new Armstrong();
		//for(int no=100;no<1000;no++){
		a1.armstrong(no);
	}
}