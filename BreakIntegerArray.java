//write a java program of BreakInteger to using built in array.
import java.util.Arrays;
class BreakIntegerArray{
	public void breakInteger(int no){	
		String s1=""+no;
		String s2=""+no;
		int len=s1.length();
		int []a=new int[len];
		int i=0;
		int d;
	while(i>0){
		d=no%10;
		a[i]=d;
		i++;
		no=no/10;
	}
	System.out.print(Arrays.toString(a));
	}
	public static void main(String[]args){
	BreakInteger b1=new BreakInteger();
	b1.breakInteger(96928576);
	}
}