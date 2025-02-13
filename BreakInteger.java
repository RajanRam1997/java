//import java.util.Arrays;
class BreakInteger
{
	public void breakInteger(int no){
		//s1="4672";
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
		//breakinteger using for loop
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		for(int n:a){
			System.out.println(n);
		}
		
		//System.out.print(Arrays.toString(a));
	}
	public static void main(String[]args){
	BreakInteger b1=new BreakInteger();
	b1.breakInteger(467572);
	}
}