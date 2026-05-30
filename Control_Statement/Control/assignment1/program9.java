//1 2 3 4 
//8 7 6 5
//9 10 11 12
//16 15 14 13
class Demo{
	public static void main(String []args){
		int num=4;
		int count=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i%2!=0){
					System.out.print(count);
					count++;
				}
				if(i%2==0){
					System.out.print(count);
					count--;
				}
				
			}
			num--;
			count=count+num;
			System.out.println();
		}	
	}
}
			
