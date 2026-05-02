//2hrs=20ru
//vip=true=0ru;
//next hrs=10ru
class Demo{
	public static void main(String []args){
		int hrs=2;
		boolean vip=false;
		if(hrs<=2 && vip==false){
			System.out.println(hrs*20);
		}
		else if(hrs>=2 && vip==false){
				System.out.println((2*20)+((hrs-2)*10));
			}
		else{
			System.out.println("No charges");
		}
	}
}
// my respective correct

