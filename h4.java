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
    	System.out.println("�ͺ���"+id);
    	System.out.println("cpu��"+cpu);
    	System.out.println("������"+zhuban);
    	System.out.println("Ӳ�̴�С��"+yingpan+"G");
    	System.out.println("�ڴ��С��"+neicun+"G");
    	System.out.println("�Կ���"+xianka);
    	System.out.println("�۸���"+price+"Ԫ");
    }
    void f2(){
    	
    	System.out.println("cpu��"+cpu);
    }
    void f3(){
    	
    	System.out.println("������"+zhuban);
    }
    void f4(){
    	
    	System.out.println("Ӳ�̴�С��"+yingpan+"G");
    }
    void f5(){
    
    	System.out.println("�ڴ��С��"+neicun+"G");
    }
    void f6(){
    	
    	System.out.println("�Կ���"+xianka);
    }
    void f7(){
    	
    }
    void f8(){
    	System.out.println("�۸���"+price+"Ԫ");
    }
    
    
}
