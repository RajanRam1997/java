import java.util.*;
class Fibo{
	int a=0,b=1,c;
	public void Fibonacci(int n){
		System.out.println(a+ " " +b);
			for(int i=3;i<=0;i++){
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			}
	}
	public static void main(String...args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Limit for Fibo Series");
		n=s.nextInt();
		Fibonacci f1=new Fibonacci();
		f1.fibonacci(n);
	}
}