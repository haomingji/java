package homework18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class game {
	public static void main(String[] args) {
		prize2 p=new prize2();
		p.set();
		p.shuchu();
		p.panduan();
	}

}
class prize1 implements Comparable<prize1>{
	int score;

	public prize1(int score) {
		super();
		this.score = score;
	}
	public int compareTo(prize1 p){
		int a=this.score-p.score;
		return a;
	}
}
class prize2{
	TreeSet<prize1> set=new TreeSet<prize1>();
	ArrayList<prize1>list=new ArrayList<prize1>();
	prize1 p1=new prize1(25);
	prize1 p2=new prize1(30);
	prize1 p3=new prize1(55);
	prize1 p4=new prize1(60);
	prize1 p5=new prize1(15);
	prize1 p6=new prize1(45);
	prize1 p7=new prize1(50);
	prize1 p8=new prize1(20);
	prize1 p9=new prize1(35);
	prize1 p10=new prize1(40);
	int k=10;
	int life=10;
	int total=0;
	void set(){
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		set.add(p7);
		set.add(p8);
		set.add(p9);
		set.add(p10);
	}
	void shuchu(){
		Iterator<prize1> it=set.iterator();
		while(it.hasNext()){
			System.out.println("积分是"+it.next().score);
		}
		}
	void panduan(){
		
		Scanner scan=new Scanner(System.in);
			while(life>0){
				Iterator<prize1> it2=set.iterator();
					while(it2.hasNext()){
						int j=0;
						prize1 h=it2.next();
						int m=new Random().nextInt(k);
				System.out.println("随机数是"+m);
			    int n=scan.nextInt();
						if(m==n){
							life--;
							k--;
						total=total+h.score;
						it2.remove();
						}
						else{
							life--;
					}
						System.out.println("和为"+total);
						shuchu();
					}
}
	while(life==0){
				if(total>=100){
					System.out.println("success!");
				}
				else{
					System.out.println("you lose");
				}
			}
	}
}