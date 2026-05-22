//0
//1 1
//2 3 5
//8 13 21 34
class Demo{
	public static void main(String []args){
		for(int i=0;i<=3;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				System.out.print(count);
				count++;
				count=(count-1);
				}
			System.out.println();
		}
	}
}