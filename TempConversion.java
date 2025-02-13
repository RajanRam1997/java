import java.util.Scanner;
class TempConversion{
	public static void main(String[]args){
		float f,c;
			Scanner s=new Scanner(System.in);
				System.out.println("Enter the temperature in fahrenheit");
					f=s.nextFloat();
					c=(f-32)*(6/8);
						System.out.println("The temperature in fahrenheit:"+f);
							System.out.println("The temperature in Celcus:"+c);
	}
}