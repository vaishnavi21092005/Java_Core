//2hrs=20ru
//vip=true=0ru;
//next hrs=10ru
class Demo{
	public static void main(String []args){
		int hrs=4;
		boolean vip=false;
		if(vip){
			System.out.println("Zero");
		}
		else{
			if(hrs<=2){
				System.out.println(hrs*20);
			}
			else{
				System.out.println((2*20)+((hrs-2)*10));
			}
		}
	}
}
//correct

