package fr.dauphine.ja.ChoubaneSamia.generics;

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
	
	
	public static 
	
	
	public static void main(String[] args) {
		
		System.out.println(Max(42,1664));
		System.out.println(Max(2014,86,13));
		System.out.println(Max());
		
		
		
		
		
	}
	
	
	

}
