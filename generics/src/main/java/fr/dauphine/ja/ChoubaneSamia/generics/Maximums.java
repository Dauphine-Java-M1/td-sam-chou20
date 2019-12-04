package fr.dauphine.ja.ChoubaneSamia.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maximums {
	
	
	
	private  static  int myMax(Integer first, Integer...tab)  {
		
		/*
			if (tab == null || tab.length == 0){
				throw new IllegalArgumentException("tableau vide");
			}
		 */
		
		int max = first;
		
		for (int i : tab ) {
			if (i > max) {
				max=i;
			}	
		}
		return max ;
	}
	
	
	public static < T extends Comparable<T> > T myMax(T first, T...tab){
		T max = first ;
		
		for (T t : tab){
			if(t.compareTo( max )==1){
				max= t;
			}
		}
		
		return max;
	}
	

	
	private static void print(List<Object> list) {
	for(Object o:list)
		System.out.println(o);
	}
	
	
	public static List listLength(List list) {
		ArrayList length=new ArrayList();
		
		for(int i=0;i<list.size();i++) {
			CharSequence seq=(CharSequence)list.get(i);
			length.add(seq.length());}return length;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(myMax(42,1664));
		System.out.println(myMax(2014,86,13));
		//System.out.println(myMax());
		
		
		/*
		List<String> list = Arrays.asList("foo","toto");
		print(list);
		*/
		
		List l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
		
		
	}
	
	
	

}
