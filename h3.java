package homework17;

import java.util.HashSet;
import java.util.Iterator;

public class h3 {
	public static void main(String[] args) {
		HashSet<Fruit> hs = new HashSet<Fruit>();
		Fruit f1=new Fruit("china", "apple", 10);
		Fruit f2=new Fruit("America", "peer", 100);
		Fruit f3=new Fruit("England", "juice", 25);
		Fruit f4=new Fruit("Korea", "apple", 10);
		
		hs.add(f1);
		hs.add(f2);
		hs.add(f3);
		hs.add(f4);
		Iterator<Fruit> it=hs.iterator();
		while(it.hasNext()){
			Fruit fruit=it.next();
			System.out.println(fruit.place+" "+fruit.name+" "+fruit.price);
		}
		
		
		
	}

}
class Fruit{
	String name;
	int price;
	String place;
	public Fruit(String place,String name,int price) {
		super();
		this.name=name;
		this.price=price;
		this.place = place;
	}
	public int hashCode(){
		return price;
	}
public boolean equals(Object obj){
	Fruit f = (Fruit) obj;
	return f.place==this.place;
}
}
