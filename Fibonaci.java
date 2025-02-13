import java.util.*;
class Fibonaci{
	public void Fibonaci(int n){
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		for(int i=3;i<=n;i++){
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}
	public static void main(String...args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Limit for Fibonaci Series");
		n=s.nextInt();
		Fibonaci f1=new Fibonaci();
		f1.fibonaci(n);
	}
}