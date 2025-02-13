class Pattern2{
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
	public static void main(String[]args){
		Pattern2 p1=new Pattern2();
		p1.Pattern2();
	}
}