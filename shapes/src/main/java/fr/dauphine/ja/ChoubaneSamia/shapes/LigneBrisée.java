package fr.dauphine.ja.ChoubaneSamia.shapes;

import java.util.Arrays;
import java.util.LinkedList;



public class LigneBrisée {
	
	static int count ;
	int capacité = 0;
	Point [] tab = null ;
	
	LinkedList listPoint ;
	
	
	public LigneBrisée  (int capacité){
		this.capacité=capacité;
		this.tab = new Point[capacité]; 
	}
	
	
	public LigneBrisée (){
		this.listPoint= new LinkedList<>();
	}
	
	
	public void AddPoint(int index , Point p){
		if ( index <tab.length ){
							
			tab[index]=p;
			
			count++;
			
		}else {System.out.println("impossible d'ajouter le point :"+p + "  \n >>>>> dépassement de la capassité du tableau !!!!!");}
	}
	
	
	public void AddPoint(Point p){
		listPoint.add(p);
	}
	
	
	public void AffichePointLigneBrisée() {	
	for (int i= 0; i<capacité; i++){
		System.out.print(tab[i]); 
	}

	}
	
	
	public int pointCapacity(){
		return capacité;
	}
	
	public int nbpoint(){
		return count;
	}
	
			//Avec LinkedList
	public int listNbpoint(){
		return listPoint.size();
	}
	
	
	public boolean contains(Point point){
		boolean bool =false;
		
		for (Point p : tab ){
			if ( p.equals(point) ) 
					///if (p.hashCode()==point.hashCode())
				 bool = true;
			
		}
		return bool ;
	}
	
			//Avec LinkedList 
	public boolean containsList(Point point){
			return listPoint.contains(point);
	}


	public static void main(String[] args) {
		LigneBrisée l = new LigneBrisée(4);
		Point p1= new Point(0,0);
		Point p2= new Point(1,1);
		Point p3= new Point(2,2);
		Point p4= new Point(2,2);
		l.AddPoint( 0,p1);
		l.AddPoint( 1,p2);
		l.AddPoint( 2,p3);
		//l.AddPoint(4, p4);
		
		
		l.AffichePointLigneBrisée();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Nombre de point actuellement sur la ligne brisée :" +l.nbpoint());
		System.out.println();
		System.out.println("la capacité de la ligne brisée est de : " +l.pointCapacity());
		
				/*
				 * 	
					Exception in thread "main" java.lang.NullPointerException
					
				Regler cette ERREUR !!!
				 */
		//System.out.println(l.contains(p1));
		
		System.out.println("");
		System.out.println("................... Utilisation de la LinkedList .............");
		
		LigneBrisée ll= new LigneBrisée();
		ll.AddPoint(p1);
		ll.AddPoint(p2);
		ll.AddPoint(p3);
		ll.AddPoint(p4);
		
		System.out.println(" nombre de points dans la LinkedList :  " + ll.listNbpoint());
		
		System.out.println(" la ligne brisée contien le point "+ p3.toString() + " : " +ll.containsList(p3));
	
		
	}
}
