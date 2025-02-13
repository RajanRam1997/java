class Peramid{
	int i;
	int j;
	public void Pattern2(){
		//A
		//A B
		//A B C 
		//A B C D
		for(int i=65;i<=69;i++){
			for(int j=65;j<=i;j++){
				System.out.printf("%4c",j);
			}
		System.out.println();
		}
	}
	public void Pattern3(){
		for(int i='A';i<='Z';i++){
			for(int j='A';j<=i;j++){
				System.out.printf("%3c",j);
			}
		System.out.println();
		}
	}
	public void Pattern4(){
		for(int i='A';i<='M';i++){
			for(int j='A';j<=i;j++){
				System.out.printf("%3d",j);
			}
		System.out.println();
		}
	}
	public static void main(String[]args){
		Peramid p1=new Peramid();
		p1.Pattern2();
		p1.Pattern3();
		p1.Pattern4();
	}
}