import java.util.Scanner;
class PrimeNumber{
	public void PrimeNumber(int no){
		boolean flag=true;
		for(int i=2;i<no;i++){
			if(no%i==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("The Number is Prime"+no);
		}else{
			System.out.println("The Number is not Prime");
		}	
	}
	public static void main(String[]args){
		int no;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Number");
		no=s.nextInt();
		Prime p1=new Prime();
		//for(int no=2;no<=100;no++)
		p1.prime(no);
	}
}