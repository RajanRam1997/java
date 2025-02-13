import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[]args)
	{
		float radius;
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter radius of circle");
				radius=sc.nextFloat();
					System.out.println("The radius is:"+radius);
						System.out.println("The Area of circle is:"+(3.14f*radius*radius));
	}

}