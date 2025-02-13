//Sorting an Array (Using Built-in Method)
import java.util.Arrays;
public class SortArray 
{
    public static void main(String[] args) 
	{        
		int[] numbers = {42, 12, 89, 63, 7};
        System.out.println("Original Array:");        
		System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));    
	}
}
//public class BubbleSort{
	/*public void Sort(){
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public void print(){
		System.out.println("\n the arrary is : \n");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
	}
	public static void main(String...args){
		BubbleSort b1=new BubbleSort();
		b1.init();
		b1.print();
		b1.sort();
		b1.print();
	}
}*/