class Demo3{
	public static void main(String []args){
		int balance=5000;
		int withdraw=550;
		if(balance>=withdraw){
			if(withdraw>=0){
				if(withdraw%100==0){
					System.out.println("Success");
				}
				else{
					System.out.println("you are only withdraw multiply by 100");
				}
			}
			else{
				System.out.println("Enter zero");
			}
		}
		else{
			System.out.println("Insufficient balance");
		}

	}
}









