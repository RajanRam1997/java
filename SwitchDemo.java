import java.util.Scanner;
class SwitchSizeDemo
{
	public static void main(String[]args)
	{
		int size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your size of TShirt");
		size=s.nextInt();
		Switch(size){
		case38: System.out.println("Size of your TShirt is S");
				 System.out.println("Prize: Rs.400/-");
				 break;
		case40: System.out.println("Size of your TShirt is M");
				 System.out.println("Prize: Rs.550/-");
				 break;
		case42: System.out.println("Size of your TShirt is L");
				 System.out.println("Prize: Rs.650/-");
				 break;
		case44: System.out.println("Size of your TShirt is XL");
				 System.out.println("Prize: Rs.800/-");
				 break;
		case48: System.out.println("Size of your TShirt is XXL");
				 System.out.println("Prize: Rs.1200/-");
				 break;
				 /*default:System.out.println("your Entered size is not available");*/
		}
	}
}