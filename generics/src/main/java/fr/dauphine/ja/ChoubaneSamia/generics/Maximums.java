package fr.dauphine.ja.ChoubaneSamia.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maximums {
	
	
	
	private  static  int Max(Integer first, Integer...tab)  {
		
		if (tab.length==0) {
			throw new IllegalArgumentException("tableau vide !!!! ");
		}
		
		int max = tab[0];
		
		for (int i : tab ) {
			if (i > max) {
				max=i;
			}	
		}
		return max ;
		
		
		
		
	}
	
	
	/*
	private static  <T> max(T implements Comparable<T>...tab ){
		T t;
		
		if (tab.length==0) {
			throw new IllegalArgumentException("tableau vide !!!! ");
		}
		
		int max = tab[0];
		
		for (T i : tab ) {
			if (max.co) {
				max=i;
			}	
		}
		return max ;
		
		
		return t;
	}
	
  */
	

	
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
		
		System.out.println(Max(42,1664));
		System.out.println(Max(2014,86,13));
		// System.out.println(Max());
		
		
		
		List<String> list = Arrays.asList("foo","toto");
		print(list);
		
		
		List l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
		
		
	}
	
	
	

}
