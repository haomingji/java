package test1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	main3 m=new main3();
	m.test2(s);
}

public void  test1(String s){
int sum=0;
StringBuffer sb=new StringBuffer(s);
for (int i = 0; i < sb.length()-1; i++) {
	if(sb.charAt(i)==sb.charAt(i+1)){
		
	 sb.setCharAt(i+1,'z');
	
		 sum++;	
	}
}
System.out.println(sum);

}
public void test2(String s){
	int sum=1;
	int length=0;
	List<Integer> list=new ArrayList<Integer>();
	for (int i = 0; i < s.length()-1; i++) {
		if(s.charAt(i)=='A'||s.charAt(i)=='T'||
				s.charAt(i)=='G'||s.charAt(i)=='C'
				){
			if(s.charAt(i+1)=='A'||s.charAt(i+1)=='T'||
					s.charAt(i+1)=='G'||s.charAt(i+1)=='C'){
				sum++;
				if(i+1==s.length()-1){
					list.add(sum);
				}
			}
			if(s.charAt(i+1)!='A'&&s.charAt(i+1)!='T'&&
					s.charAt(i+1)!='G'&&s.charAt(i+1)!='C'){
				list.add(sum);
				sum=1;
			}
		}
		
	}
	for (int i = 0; i < list.size(); i++) {
		if(list.get(i)>length){
			length=list.get(i);
		}
	}
	System.out.println(length);
}
}
