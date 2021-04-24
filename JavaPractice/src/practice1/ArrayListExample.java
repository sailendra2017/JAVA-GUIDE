package practice1;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Sailnedra");
		list1.add("Raju");
		list1.add("Saimanish");
		list1.add("Siddu");
		list1.add("rama");
		list1.set(3, "Jaga");
		
		System.out.println(list1);
		Collections.sort(list1);
		Iterator itr = list1.iterator();
		while(itr.hasNext())
		{
			System.out.println("Array List Item is : "+itr.next());
		}
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Sailnedra");
		list2.add("Raju");
		list2.add("Saimanish");
		list2.add("Siddu");
		list2.add("rama");
		
		Iterator itr1 = list2.iterator();
		while(itr1.hasNext())
		{
			System.out.println("Linked List Item is : "+itr1.next());
		}
		
		Vector<String> list3 = new Vector<String>();
		list3.add("Sailnedra");
		list3.add("Raju");
		
		Iterator itr3 = list3.iterator();
		while(itr3.hasNext())
		{
			System.out.println("Vector List Item is : "+itr3.next());
		}
		
		Stack<String> list4 = new Stack<String>();
		list4.add("Sailnedra");
		list4.add("Raju");
		list4.pop();
		Iterator itr4 = list4.iterator();
		while(itr4.hasNext())
		{
			System.out.println("Stack List Item is : "+itr4.next());
		}
		
		System.out.println("===============================================================");
		System.out.println("=============================QUEUE==================================");
		
		PriorityQueue<String> list5 = new PriorityQueue<String>();
		list5.add("Sailnedra");
		list5.add("Raju");
		list5.add("Gyana");
		list5.peek();
		Iterator itr5 = list5.iterator();
		while(itr5.hasNext())
		{
			System.out.println("Priority Queue Item is : "+itr5.next());
		}
		
		Deque<String> list6 = new ArrayDeque<String>();
		list6.add("Sailnedra");
		list6.add("Raju");
		list6.add("Gyana");
		Iterator itr6 = list6.iterator();
		while(itr6.hasNext())
		{
			System.out.println("Deque Queue Item is : "+itr6.next());
		}
		
		for(String item:list6)
		{
			System.out.println("Deque Data:"+item);
		}
		
		System.out.println("====================================================================");
		System.out.println("====================================SET================================");
		
		HashSet<String> list7 = new HashSet<String>();
		list7.add("Sailnedra");
		list7.add("Raju");
		list7.add("Gyana");
		for(String item:list7)
		{
			System.out.println("Hash set Data:"+item);
		}
		
		LinkedHashSet<String> list8 = new LinkedHashSet<String>();
		list8.add("Sailnedra");
		list8.add("Raju");
		list8.add("Gyana");
		for(String item:list8)
		{
			System.out.println("Linked Hash Set Data:"+item);
		}
		
		SortedSet<String> list9 = new TreeSet<String>();
		list9.add("Sailnedra");
		list9.add("Raju");
		list9.add("");
		list9.forEach(a->{System.out.println("Foreach with lamda expression : "+a);});
		Iterator<String> itr9 =list9.iterator();  
		itr9.forEachRemaining(a->{System.out.println("Foreach Remaining with lamda expression : "+a);});
		
		System.out.println("================================================================");
		 ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Hanumat");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  al.retainAll(al2);  
		  System.out.println(al);
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator itr10=al.iterator();  
		  while(itr10.hasNext()){  
		   System.out.println(itr10.next());  
		  }  
		  
		  TreeSet<String> list11 = new TreeSet<String>();
			list11.add("Sailnedra");
			list11.add("Raju");
			list11.add("Gyana");
			for(String item:list11)
			{
				System.out.println("Tree Set Data:"+item);
			}
			
		System.out.println("=====================================================================");
		Map map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr12=set.iterator();  
	    while(itr12.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr12.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	}

}
