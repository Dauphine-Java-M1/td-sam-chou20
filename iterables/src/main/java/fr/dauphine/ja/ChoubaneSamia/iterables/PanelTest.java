package fr.dauphine.ja.ChoubaneSamia.iterables;

import java.util.Iterator;
import java.util.List;

public class PanelTest {

	
    public static void main(String[] args) {
    	
         Iterator<Integer> it = Panel.panel1(1,5);
         for(;it.hasNext();)
            System.out.println(it.next()); // Affiche 1 2 3 4 5
         
         
         
         System.out.println("Question 3 : Parcours de l’intervalle en supportant la syntaxe foreach ");
         
         
         
         for (int i: Panel.panel2(1,5))
        	 System.out.println(i);
            
         System.out.println("Question 5 : AbstractList : ");
         
         List<Integer>l = Panel.panel(3,6);
         for (int i : l){
        	 System.out.println(i);
         }
         	
         System.out.println("Element à la position 1 est : " );
         System.out.println(l.get(1));
         System.out.println("Taille de la liste est : " + l.size());
    
    }

}


	
	
	
	
	
	

