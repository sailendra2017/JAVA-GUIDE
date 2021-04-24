package practice1;

import java.util.*;

public class Predicate {
	  public static void main(String args[]) {
	      List<Integer> numList = new ArrayList<>();
	      numList.add(5);
	      numList.add(10);
	      Predicate<Integer> pred = i -> i > 5;
	      numList.stream().filter(pred).forEach(i -> System.out.println(i));
	   }
}
