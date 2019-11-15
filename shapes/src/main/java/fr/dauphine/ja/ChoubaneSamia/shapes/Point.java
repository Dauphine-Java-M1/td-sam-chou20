package fr.dauphine.ja.ChoubaneSamia.shapes;

public class Point {
	
	
	
	private int x;
	private int y;
	
	private static int count =0;
	
	public Point (int x , int y){
		count++;
		this.x= x;
		this.y=y;
		
	}
	
	public Point (Point p){
		this.x = p.getX();
		this.y= p.getY();
	}
	
    public int getX(){
    	return x;
    }
    
	public int getY() {
		return y;
	}

	public void setX(int x){
		this.x = x ;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + x + "," + y + ")";
	}
	
	
	
	public boolean isSameAs(Object o){
		if (!(o instanceof Point))return false;
		Point p = (Point)o;
		return p.x==this.x &&  p.y==this.y ;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (!(obj instanceof Point))return false;
		Point p = (Point)obj;
		return p.x==this.x && p.y==this.y;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return x^Integer.rotateLeft(y, 16);
	}
	
	
	public void translate (int dx,int dy ){
		this.x = x+dx;
		this.y = y+dy;
		
	}
	
    public static void main( String[] args ){
    	Point p = new Point(10, 20);
    	Point p1 = new Point(10, 20);
    	Point p2 = new Point(10, 20);
    	System.out.println(p.x+"  "+p.getY());
    	System.out.println(p);
    	
    	System.out.println("......le nombre de point crées : .....");
    	System.out.println(Point.count);
    	
    	
    	Point p8 = new Point(p2);
    	System.out.println(p8);
    	
    	System.out.println(p.equals(p1));
    	System.out.println(p.isSameAs(p1));
    	System.out.println(p.hashCode());
    	System.out.println(p1.hashCode());
    }

}
