package h15;

import java.util.ArrayList;

public class h3 {
	public static void main(String[] args) {
		ArrayList <point> list =new ArrayList<point>(); 
	    point p1=new point();
	    p1.x=8;
	    p1.y=4;
		list.add(p1);
		point p2=new point();
		p2.x=5;
		p2.y=9;
		list.add(p2);
		point p3=new point();
		p3.x=2;
		p3.y=6;
		list.add(p3);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size()-1; j++) {
				if(list.get(j).x>list.get(j+1).x){
					point temp=list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		System.out.println("°´xÉıĞòÅÅÁĞ");
		for (int i = 0; i < list.size(); i++) {
			point p =list.get(i);
			System.out.print(p.x+",");
			System.out.print(p.y+" ");
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size()-1; j++) {
				if(list.get(j).y<list.get(j+1).y){
					point temp=list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}System.out.println("°´y½µĞòÅÅÁĞ");
		for (int i = 0; i < list.size(); i++) {
			point p =list.get(i);
			System.out.print(p.x+",");
			System.out.print(p.y+" ");
	}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size()-1; j++) {
				if(getDistance(list.get(j).x,list.get(j).y)>getDistance(list.get(j+1).x,list.get(j+1).y)){
					point temp=list.get(j);
				    list.set(j,list.get(j+1));
				    list.set(j+1, temp);
				}
			}
			}
		System.out.println();
		System.out.println("°´¾àÀëÔ­µã¾àÀëÉıĞòÊä³ö");
		for (int i = 0; i < list.size(); i++) {
			point p =list.get(i);
			System.out.print(p.x+",");
			System.out.print(p.y+" ");
		}
			
		}
			
			
		


	 public static double getDistance(double x,double y){
		  return Math.sqrt(x*x+y*y);
}
}







class  point {
	 int x;
	 int y;
}