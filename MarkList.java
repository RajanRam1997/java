import java.util.Scanner;
class MarkList
{
	public static void main(String[]args){
		int m1,m2,m3;
			Scanner sc=new Scanner(System.in);
				System.out.println("'Enter the m1:");
				m1=sc.nextInt();
					System.out.println("'Enter the m2:");
					m2=sc.nextInt();
						System.out.println("'Enter the m3:");
						m3=sc.nextInt();
				System.out.println("Total mark:"+(m1+m2+m3));
					System.out.println("Avg mark:"+(m1+m2+m3/3));
	}				
}