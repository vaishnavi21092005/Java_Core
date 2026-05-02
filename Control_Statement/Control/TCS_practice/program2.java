//order>=500=0ru;
//primium=true=0ru;
//order<500=50ru

class Demo2{
	public static void main(String []args){
		int order_cost=900;
		boolean primium=false;
		if(order_cost>=500){
			if(primium==true){
				System.out.println("Zero");
			}
			else{
				System.out.println("50");
			}
		}
		else{
			System.out.println("50");

			}

	 }
}
//wrong

		
