import java.util.*;
class Fibonacci1{
	public void Fibonacci(int n){
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
		Fibonacci f1=new Fibonacci();
		f1.fibonacci(n);
	}
}