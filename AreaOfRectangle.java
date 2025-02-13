import java.util.Scanner;
class AreaOfRectangle
{
	public static void main(String[]args)
	{
	int len,bre;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter any length");
				len=sc.nextInt();
					System.out.println("Enter any breath");
						bre=sc.nextInt();
							System.out.println("The length is:"+len);
								System.out.println("The breath is:"+bre);
									System.out.println("The Area of Rectengle is:"+len*bre);
	}

}