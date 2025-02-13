import java.util.Scanner;
class Matrix{
	public void acceptMatrix(int[][]m){
		System.out.println("Enter the Elements of 3*3 Matrix");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				m[i][j]=s.nextInt();
			}
		}
	}
	public void printMatrix(int[][]m){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.printf("%4d",m[i][j]);
//(m[i][j]+"");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		Matrix m1=new Matrix();
		int[][]m=new int[3][3];
		m1.acceptMatrix(m);
		m1.printMatrix(m);
	}
}