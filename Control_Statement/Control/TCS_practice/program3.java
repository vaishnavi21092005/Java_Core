//order>=500=0ru;
//primium=true=0ru;
//order<500=50ru
class Demo{
	public static void main(String []args){
		int order_cost=100;
		boolean primium=false;
		if(primium){
			System.out.println("Zero");
		}
		else{
			if(order_cost>=500){
				System.out.println("Zero");
			}
			else{
				System.out.println("50ru");
			}
		}
	}
}
//correct

