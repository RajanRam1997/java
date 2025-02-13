//Basic Array Declaration and Traversal
class ArrayExample 
{
    public static void main(String[] args)
	{
		int[] number= {10, 20, 30, 40, 50};
       // System.out.println("First Elements:"=number[0]);
		//System.out.println("Last Element:"+number[number.length-1]);
		System.out.println("All elements in the array:");
		
        for (int num:number) 
		{            
			System.out.println(num);
        }
			System.out.println("array length:"+number.length);
	}
}