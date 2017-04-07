package homework17;

import java.util.HashSet;
import java.util.Iterator;

public class h1 {
	public static void main(String[] args) {
		HashSet<Triangle> hs=new HashSet<Triangle>();
		Triangle t1= new Triangle(20,60);
		Triangle t2= new Triangle(20,60);
		Triangle t3= new Triangle(30,60);
		hs.add(t1);
		hs.add(t2);
		hs.add(t3);
	 Iterator<Triangle> it=hs.iterator();
	 while( it.hasNext()){
		 Triangle t= it.next();
		 System.out.println(t.a+" "+t.b);
	 }
		
	
}

}
 class  Triangle{
	int a;
	int b;
	
	 public Triangle(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
	
	public int hashCode() {
		return a;
	}
	public boolean equals(Object obj){
		Triangle t= (Triangle) obj;
		return t.b ==this.b;
	}
}


