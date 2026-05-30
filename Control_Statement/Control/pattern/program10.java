//0
//1 1
//2 3 5
//8 13 21 34
class Demo{
	public static void main(String []args){
		int first=0;
		int second=1;
		int sum;
		System.out.println(first);
		System.out.print(second);
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				sum=first+second;
				first=second;
				second=sum;
				System.out.print(sum);
				if(i==2){
				i++;
				}
			}
		System.out.println();	
		}
	}
}

		