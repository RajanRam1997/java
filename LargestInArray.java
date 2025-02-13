//Find the Largest Element in an Array
class LargestInArray 
{    
	public static void main(String[] args) 
	{
        int[] numbers = {12, 34, 56, 78, 90, 11};        
		int max = numbers[0];
        for (int num: numbers) 
		{
            if (num > max) 
			{                
				max = num;
            }        
		}
        System.out.println("Largest Element: " + max);
    }
}