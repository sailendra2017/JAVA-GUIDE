package practice1;

interface TestInterface {
	public void test();
}

public class Test1 implements TestInterface{
	public void test()
	{
		System.out.println("Hi you are");
	}
	public static void main(String[] args) {
		System.out.println("Hi this is interface");
	}
}