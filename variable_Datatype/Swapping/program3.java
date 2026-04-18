class Demo{
	public static void main(String []args){
		int a=65;
		char ch=a;
		System.out.println(a);
		System.out.println(ch);
	}
}
//error: incompatible types: possible lossy conversion from int to char
//Because of int have memory 4bytes and char have memory 2bytes.