import java.util.Arrays;
class ArraySort{
	public static void main(String...args){
		int[]a={2,0,-1,4};
		char[]b={'Q','P','F','M'};
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(" ");
			for(int n: a){
				System.out.print(n+ " ");
			}
		System.out.println("\n");
			for(char c: b){
				System.out.print(c+ " ");
			}
	}
}