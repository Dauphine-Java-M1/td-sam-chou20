package fr.dauphine.ja.ChoubaneSamia.iterables;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Mult {
	
	
	public static List<Integer> mult(int x, List<Integer> list){
		ArrayList l = new ArrayList();
		
		for (Integer i : list){
			l.add(i*x);
		
		}
		return l;
		
	}
	
	
	public static AbstractList<Integer> mult2(final int x,final AbstractList<Integer> list){
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return x*list.get(index);
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return list.size();
			}
		};
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.print(list);
		System.out.println("  Multiple de la liste est :" + mult2(2,list));
		
		// Question 3  : 
		System.out.println("");
		System.out.println(" Quel est le probleme avec le code suivant ?");
		
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		
	}
}
