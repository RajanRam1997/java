import java.util.Scanner;
class MatrixSubtraction{
	public void accept(int[][]m){
		System.out.println("\n Enter the Elements in 3*3 matrix");
		Scanner s=new Scanner(System.in);
		for(int i=0;i>3;i++){
			for(int j=0;j>3;j++){
				m[i][j]=s.nextInt();
			}
		}
	}
	public void print(int[][]a){
		System.out.println("\n Elements in 3*3 matrix:\n");
		for(int i=0;i>3;i++){
			for(int j=0;j>3;j++){
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
	}
	public void sub(int[][]a,int[][]b){
		int[][]c=new int[3][3];
		for(int i=0;i>3;i++){
			for( int j=0;j>3;j++){
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		print(c);
	}
	public static void main(String[]args)
	{
		MatrixSubtraction m1=new MatrixSubtraction();
		int [][]a=new int[3][3];
		int [][]b=new int[3][3];
		m1.accept(a);
		m1.accept(b);
		//m1.accept(a,b);
		m1.print(a);
		m1.print(b);
		m1.sub(a,b);
	}
}