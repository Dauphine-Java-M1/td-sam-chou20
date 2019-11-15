package fr.dauphine.ja.ChoubaneSamia.shapes;

import java.util.ArrayList;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p= new Point(10,200);
		System.out.println(p.getX() + " " +p.getY());
		System.out.println("..... Affichage après redefinition de toString()....");
		System.out.println(p);
		
		
		// exercice 2. Egalité
		
		// Question 1
		
		Point p1 = new Point(1,2);
		Point p2=p1;
		Point p3 = new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		System.out.println(" ");
		
		System.out.println(p1.equals(p3));
		System.out.println(p1.isSameAs(p3));
		
		
		// Question 2 
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
	
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		list.add(p3);
		list.add(p1);
		list.add(p2);
		//System.out.println(list.indexOf(p1));
		//System.out.println(list.indexOf(p3));
		System.out.println(list.indexOf(p2));
	}
	
}