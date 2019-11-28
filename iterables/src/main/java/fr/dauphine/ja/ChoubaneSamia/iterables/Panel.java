package fr.dauphine.ja.ChoubaneSamia.iterables;

import java.util.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.w3c.dom.views.AbstractView;

public class Panel extends AbstractList <Integer>  implements Iterable<Integer> , Iterator <Integer> {
	
	private int x ;
	private int y ;
	
	public Panel (int debut , int fin){
		this.x = debut;
		this.y = fin;
	}
	
	
	// Question 1 : 
	
	 public static Iterator<Integer> panel1( int x, int y){
	 return new Panel(x, y).iterator();
	 }
	
		@Override
		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			return new Iterator<Integer>() {
					
					int nextValue = x ;
					 
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return nextValue <= y;
					}

					@Override
					public Integer next() {
						// TODO Auto-generated method stub
						
			               if (!hasNext()) {
			                    throw new NoSuchElementException();
			                }  
						return Integer.valueOf(nextValue++);
					}
				};			
		}
	 
	
	 // Question 3 : Parcours de l’intervalle en supportant la syntaxe foreach
	 
	 public static ArrayList <Integer> panel2( int x, int y){
		
		 ArrayList<Integer> l = new ArrayList();
		 
		 Iterator it = new Panel(x,y).iterator();
		 while (it.hasNext()){
		 l.add((Integer) it.next());
		 }
		 
	 return l;		 
	 }
	 
	 
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			int nextValue = x;
			return nextValue <= y;
		}


		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			
			int nextValue = x;
			
			if (!hasNext()){
				throw new NoSuchElementException(); 
			}
			return Integer.valueOf(nextValue++);
		}
		
		
		
		
		
		// Quetion 4 & 5 : AbstractList 
		
		@Override
		public Integer get(int index) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
		public static  ArrayList panel(int x, int y ){
			 ArrayList<Integer> l = new ArrayList();
			 
			 Iterator it = new Panel(x,y).iterator();
			 while (it.hasNext()){
			 l.add((Integer) it.next());
			 }
			
			return l;
		}
	
	 
	/* ************************************** Kifkif !!!
	 * 
	public static Iterator <Integer>  panel1 (final int x , final int y){
			Iterator it = new Iterator<Integer>() {
				
				int nextValue = x ;
				 
				@Override
				public boolean hasNext() {
					// TODO Auto-generated method stub
					return nextValue <= y;
				}

				@Override
				public Integer next() {
					// TODO Auto-generated method stub
		               if (!hasNext()) {
		                    throw new NoSuchElementException();
		                }    
					return Integer.valueOf(nextValue++);
				}	
			};
			return it ;
		}	
	*
	******************************************  */
	
	
	
	
// Qestion 2 : 	
	
/*
    public static Iterator<Integer> panel1(final int begin,final int end){
        Iterator<Integer> it = new Iterator<Integer>(){

            private int nextValue = begin;
            private final int max = end;

            public boolean hasNext() {
                return nextValue <= max;
            }

            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return Integer.valueOf(nextValue++);
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
*/
	
	
    public static void main(String[] args) {
    	
         Iterator<Integer> it = panel1(1,5);
         for(;it.hasNext();)
            System.out.println(it.next()); // Affiche 1 2 3 4 5
         
         System.out.println("Question 3 : Parcours de l’intervalle en supportant la syntaxe foreach ");
         
         for (int i: panel2(1,5))
        	 System.out.println(i);
            
         System.out.println("Question 5 : AbstractList : ");
         
         List<Integer>l = panel(3,6);
         for (int i : l){
        	 System.out.println(i);
         }
         	
         System.out.println("Element à la position 1 est : " );
         System.out.println(l.get(1));
         System.out.println("Taille de la liste est : " + l.size());
    
    }




}
