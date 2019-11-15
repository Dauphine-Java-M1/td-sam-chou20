package fr.dauphine.ja.ChoubaneSamia.shapes;

	
	public class Cercle {
		Point p;
		int rayon;
		
		public Cercle (Point p, int rayon){
			this.p= p;
			this.rayon=rayon;
		}
		
		
		public void transtate(int dx,int dy){
			p.translate(dx,dy);
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " Cercle de centre : " + p.toString()+" et de rayon : " +rayon;	}
		

		public static void main(String[] args) {
			
			
			Cercle c = new Cercle(new Point(1, 2), 1);
			Cercle c2 = new Cercle(new Point(1, 2), 2);
			System.out.println(c.toString());
			
			c2.transtate(1,1);
			System.out.println(c+ " " + c2);
			

		}

	}


