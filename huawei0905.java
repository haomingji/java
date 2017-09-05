package test2;

import java.util.Scanner;

public class huawei0905 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s1=scan.next();
	String s2=scan.next();
	while(s1.length()>8){
		String s=s1.substring(0,8);
		System.out.println(s);
		s1=s1.substring(8);
	}
	while(s1.length()<=8){
		for (int i = s1.length(); i<8; i++) {
			s1=s1+"0";
		}
		System.out.println(s1);
		break;
	}
	while(s2.length()>8){
		String ss=s2.substring(0,8);
		System.out.println(ss);
		s2=s2.substring(8);
	}
	while(s2.length()<=8){
		for (int i = s2.length(); i<8; i++) {
			s2=s2+"0";
		}
		System.out.println(s2);
		break;
	}
}
}
