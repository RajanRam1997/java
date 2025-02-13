class ArrayDemo2
{
	public static void main(String[]args)
	{
		int marks[]= {90,70,63,65,85,96,78};
		System.out.println("The size of array:"+marks.length);
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("2nd element:"+marks[2]);
		marks[2]=95;
		System.out.println("2nd element:"+marks[2]);
		//for each loop
		//for(datatype variablename:Array Name){
			
		//}
		System.out.println("Array Element printing using for loop");
		for(int m:marks)
		{
		System.out.println(m);	
		}
	}
}