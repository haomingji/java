package test1;

import java.util.Scanner;

public class Wangyitest0815 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	int sum=0;
	if(s.length()>200||s.length()<2){
		s=s.substring(0,s.length()-2);
		for (int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()/2+i)){
				s=s.substring(0,s.length()-2);
				i=0;
			}
			if(s.charAt(i)==s.charAt(s.length()/2+i)){
				sum++;
				if(sum==s.length()/2){
					break;
				}
			}
			
		}
		
	}
	System.out.println(s.length());
}
}
