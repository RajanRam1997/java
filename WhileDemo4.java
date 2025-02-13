
class WhileDemo4{
	public static void main(String[]args)
	{
		int no=1;
		int sum=0;
		while(no<=10)
		{
			System.out.println(no);
			sum=sum+no;
			no++;
		}
		System.out.println("sum of all numbers:"+sum);
	}
}