import java.util.Scanner;
public class Sort{
	int []a;
	public void init(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter n Numbers");
	int s=n.nextInt();
	a=new int[a];
	System.out.println("Enter the Final Elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
	}
	public void sort(){
		int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+i]){
					temp=a[j];
					a[j]=a[j+i];
					a[j+i]=temp;
				}
			}
		}
		
	}
	public void print(){
		
	}
	public static void main(String...args){
	}
	
}