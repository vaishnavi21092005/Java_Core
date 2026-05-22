//1
//1 2
//2 3 4
//4 5 6 7
class Demo{
	public static void main(String []args){
		int count=1;
		int s=1;
		for(int i=1;i<=4;i++){
			int f=s;
			for(int j=1;j<=i;j++){
				s=count++;
				}
			for(int n=count;n<=i;n++){
				System.out.print(s);
				}
			System.out.println();
		}
	}
}