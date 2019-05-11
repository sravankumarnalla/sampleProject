package com.sravan;

import java.util.LinkedList;
import java.util.List;

public class LambdaExpressions {

	public static void main(String[] args) {
		LambdaExpressions aaa= new LambdaExpressions();
		System.out.println(aaa.toString());
		System.out.println(aaa.hashCode());
		
		String s1=new String("ab");
		String s2=new String("ba");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
 String aa;
 
 //System.out.println(a.to);
		Myfunction my = () -> {
			return 2 + 2;
		};
		System.out.println(my.sum());

		Myfunction1 my1 = (add) -> (add + add);

		System.out.println(my1.sum("sravan"));

		Myfunction2 my2 = (a, b) -> (a + b);

		System.out.println(my2.sum("sravan", "kumar"));
		
		
		List<String> list=new LinkedList<String>();  
	       list.add("Rick");         
	       list.add("Negan");       
	       list.add("Daryl");         
	       list.add("Glenn");         
	       list.add("Carl");
	       
	       
	       list.forEach(names->System.out.println(names));
	}

}

@FunctionalInterface
interface Myfunction {

	abstract int sum();
}

@FunctionalInterface
interface Myfunction1 {

	abstract String sum(String a);
}

/**
 * 
 * @author HP
 *
 */
interface Myfunction2 {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	abstract String sum(String a, String b);
}