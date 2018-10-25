class ll 
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		int i = test();
		int j = i + test();
		System.out.println("i =" +i);
		System.out.println("i =" +i);
System.out.println("from main");

	}
	public static int test()
	{
	System.out.println("from test");
	return 100;
}
}
