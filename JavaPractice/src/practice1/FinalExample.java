package practice1;

import java.util.ArrayList;
import java.util.Iterator;


public final class FinalExample {
	public void test() {
		System.out.println("Hi How are you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalExample a = new FinalExample();
		a.test();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sailendra");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
