package h15;

import java.util.ArrayList;
import java.util.Scanner;

public class h4 {
	public static void main(String[] args) {
	ArrayList<computer> clist=new ArrayList<computer>();
	computer c1 =new computer();
	computer c2=new computer();
	computer c3=new computer();
	
	c1.id=5545;c1.cpu="ARDEON7";c1.price=5600;
	c2.id=5547;c2.cpu="ARDEON8";c2.price=7800;
	c3.id=5540;c3.cpu="ARDEON6";c3.price=6700;
	clist.add(c1);
	clist.add(c2);
	clist.add(c3);
	Scanner scan=new Scanner(System.in);
	for (int i = 0;; i++) {
		int m=scan.nextInt();
	if(m==1){
		c1.f1();
	}if(m==2){
		c2.f1(); 
	}if(m==3){
		c3.f1(); 
	}
	}
//	for (int i = 0; i < clist.size(); i++) {
//		
//		c1.f1();
//		c2.f1();
//		c3.f1();
//	}
	}	
}
class computer {
    int id;
    String cpu;
    String zhuban;
    int yingpan;
    int neicun;
    String xianka;
    int price;
    void f1(){
    	System.out.println("型号是"+id);
    	System.out.println("cpu是"+cpu);
    	System.out.println("主板是"+zhuban);
    	System.out.println("硬盘大小是"+yingpan+"G");
    	System.out.println("内存大小是"+neicun+"G");
    	System.out.println("显卡是"+xianka);
    	System.out.println("价格是"+price+"元");
    }
    void f2(){
    	
    	System.out.println("cpu是"+cpu);
    }
    void f3(){
    	
    	System.out.println("主板是"+zhuban);
    }
    void f4(){
    	
    	System.out.println("硬盘大小是"+yingpan+"G");
    }
    void f5(){
    
    	System.out.println("内存大小是"+neicun+"G");
    }
    void f6(){
    	
    	System.out.println("显卡是"+xianka);
    }
    void f7(){
    	
    }
    void f8(){
    	System.out.println("价格是"+price+"元");
    }
    
    
}
