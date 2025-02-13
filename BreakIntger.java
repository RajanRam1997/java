import java.util.Arrays;
class BreakIntger
{
	public void breakInteger(int no){
		String s1=""+no;
		int len=s1.length();
		int[]a =new int[len];
		int i=0;
		int d;
		while(no>0){
			d=no%10;
			a[i]=d;
			i++;
			no=no/10;
		}
		System.out.print(Arrays.toString(a));
	}
	public static void main(String[]args){
	BreakInteger b1=new BreakInteger();
	b1.breakInteger(467572);
	}
}