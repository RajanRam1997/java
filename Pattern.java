class Pattern{
	public void pattern(){
	//1
	//23
	//456
	//78910 
	//1112131415
	int no=1;
	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.printf("%5d",no);
			no++;
		}
		System.out.println();
		}
	}
	public static void main(String[]args){
		Pattern p1=new Pattern();
		p1.pattern();
	}
}