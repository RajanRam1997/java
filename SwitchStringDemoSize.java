import java.util.Scanner;
class SwitchStringDemoSize
{
	public static void main(String[]args)
	{
		String size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your size of TShirt");
		size=s.next();
		switch(size)
		{
		case"38": System.out.println("Size of your TShirt is S");
				 System.out.println("Prize Rs400/-");
				 break;
		case"40":System.out.println("Size of your TShirt is M");
				System.out.println("Prize:Rs550/-");
				 break;
		case"42":System.out.println("Size of your TShirt is L");
				 System.out.println("Prize:Rs650/-");
				 break;
		case"44":System.out.println("Size of your TShirt is XL");
				 System.out.println("Prize:Rs800/-");
				 break;
		case"48":System.out.println("Size of your TShirt is XXL");
				 System.out.println("Prize:Rs1200/-");
				 break;
		default:System.out.println("your Entered size is not available");
				 break;
		}
	}
}