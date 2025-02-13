/*import java.util.Scanner;
public class BubbleSort{
	int []a;
	public void init(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int n=s.nextInt();
		a=new int[n];
		System.out.println("Enter The final Number You have to Sort");
			for(int i=0;i<n;i++){
				a[i]=s.nextInt();
			}
	}
	public void sort(){
			int temp;
		for(int i=0;i<a.length-1;i++){
		for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public void print(){
		System.out.println("the arrary is : ");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
	}
	public static void main(String...args){
		BubbleSort a1=new BubbleSort();
		a1.init();
		System.out.println("Array Before Sorting : ");
		a1.print();
		a1.sort();
		System.out.println("Array After Sorting : ");
		a1.print();
	}
}*/
import java.util.Scanner;

public class BubbleSort {

    int[] a; // Declare the array at the class level

    // Method to initialize the array
    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        a = new int[n]; // Initialize the array with user-defined size
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Fill the array with user input
        }
    }

    // Method to perform bubble sort
    public void sort() {
        int temp;
        for (int i = 0; i < a.length - 1; i++) { // Outer loop runs for n-1 passes
            for (int j = 0; j < a.length - 1 - i; j++) { // Inner loop optimizes unnecessary comparisons
                if (a[j] > a[j + 1]) { // Swap if elements are in the wrong order
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public void print() {
        System.out.println("The array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // Print a new line for better readability
    }

    // Main method
    public static void main(String... args) {
        BubbleSort a1 = new BubbleSort();
        a1.init();   // Initialize the array
        System.out.println("Array before sorting:");
        a1.print();  // Print the array before sorting
        a1.sort();   // Perform bubble sort
        System.out.println("Array after sorting:");
        a1.print();  // Print the sorted array
    }
}