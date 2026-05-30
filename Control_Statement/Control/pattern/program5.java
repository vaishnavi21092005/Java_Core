//0
//1 1
//2 3 5
//8 13 21 34
class Demo{
	public static void main(String []args){
		int count=1;
		for(int i=0;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count);
				count++;
				}
			System.out.println();
			count--;
		}
	}
}