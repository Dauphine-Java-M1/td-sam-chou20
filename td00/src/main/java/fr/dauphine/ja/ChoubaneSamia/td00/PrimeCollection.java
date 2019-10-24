package fr.dauphine.ja.ChoubaneSamia.td00;

import java.util.ArrayList;


public class PrimeCollection 

{
	private ArrayList<Integer> numbers ;
	
// Constructeur qui permet d'instancier numbers
	// le constructeur permet de crér une instance de cette classe (allocation mémoire)
	public PrimeCollection(ArrayList <Integer> l) {
		this.setNumbers(l);
	}
	
	
//Nouvelle methode qui permet d'inserer dans la collection numbers n entiers tirés aléatoirement 
	public void initRandom(int n, int m){
		ArrayList<Integer> l = new ArrayList<>();
		for (int i =0; i<100; i++){
		l.add((int) (Math.random()* (m-n)));
		}
		
		this.numbers = l;
	}
	
	
// getter & setter 
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	
	
//methode qui affiche true si l'entier passé en paramettre est premier false sinon
	
	private   boolean  isPrime(int p){	
		boolean  bool = false;
		for (int i=2; i <= Math.sqrt(p); i++){
		if (p/i == 0){ 
			bool = false ;	
		}
		else 
			bool = true ;
	}
		 return bool;	
	}
	
	
    public static void main( String[] args )
    
    {
    	System.out.println("---------------------------------");
    	System.out.println( " Recherche de Nombres Premiers" );
    	System.out.println("---------------------------------");
    	System.out.println("");
    	
    	ArrayList<Integer> i = new ArrayList<>();
    	i.add(1);
    	i.add(12);
    	i.add(100);
    	
    	ArrayList<Integer> ii = new ArrayList<>();
    	ii.add(10);
    	ii.add(10);
    	ii.add(10);
    	
    	System.out.println(" Insertion via Constructeur : ");
    	
    	PrimeCollection p = new PrimeCollection(i);
    	
    	/*
    	System.out.print( "{" );
    	for (int elem : i){
    	System.out.print(elem +" ");
    	}
    	System.out.print("}");
    	*/
    	
    	System.out.println(p.getNumbers());
   
    	p.setNumbers(ii);
    	System.out.println(p.getNumbers());
    	
    	
    	
    	System.out.println("---------------------------------");
    	System.out.println("insertion aléatoire dans la collection ");
    	p.initRandom(20, 600);
    	System.out.println(p.getNumbers());
    	
    	System.out.println("---------------------------------");
    	System.out.println("Calculer si un entier est premier :");
    	System.out.println(" 7 est premier ? " + p.isPrime(7));
    	System.out.println(" 100 est un entier premire? " + p.isPrime(100));
    	
    	System.out.println("---------------------------------");
    	System.out.println("tirer 100 entiers aleatoirement et affichage de ceux qui sont entiers");
    	
    	p.initRandom(1, 1000);
    	System.out.println(p.getNumbers());
    	System.out.println("");
    	
    	System.out.println("Affichage des entiers premiers de la liste: ");
    	
    	ArrayList<Integer> premier = new ArrayList<>();
    	
    	for (int j = 0 ; j<p.getNumbers().size(); j++){
    		if (p.isPrime(p.getNumbers().get(j)) == true )
    				premier.add(p.getNumbers().get(j));
    			
    	}
    	
    	System.out.print("{");
    	for (int j1 = 0; j1<premier.size();j1++){
    		System.out.print(premier.get(j1)+" ");
    	}
    	System.out.print("}");
    	
    	
    	
    }
    }
    
    