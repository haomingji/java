package homework17;

import java.util.HashSet;
import java.util.Iterator;

public class h2 {
	public static void main(String[] args) {
		HashSet<Triangle1> hs=new HashSet<Triangle1>();
		Triangle1 t4=new Triangle1(30,4,5,6);
		Triangle1 t5=new Triangle1(20,2,3,6);
		Triangle1 t6=new Triangle1(60,8,10,12);
		Triangle1 t7=new Triangle1(30,13,10,13);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
		hs.add(t7);
		Iterator<Triangle1> it=hs.iterator();
		while(it.hasNext()){
              Triangle1 t= it.next();
              System.out.println(t.a+" "+t.x+" "+t.y+" "+t.z);
		}
		
		
	}

}
class Triangle1{
	int  a;//xÓëz±ßµÄ¼Ð½Ç
	int b;
	int x;
	int y;
	int z;
	public Triangle1(int a,int x, int y, int z) {
		super();
		this.a=a;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public  int hashCode(){
		
			return  a  ;
		
		
	}
	public boolean equals(Object obj){
		Triangle1 t=(Triangle1) obj;
		return t.x*this.z==t.z*this.x;
			
		
		
	}
	
}