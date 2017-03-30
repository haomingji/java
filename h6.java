package homework14;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class h6 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	String str1 =scan.next();
	String str2 =scan.next();
	if(str1.compareTo(str2)<0){
		System.out.print(str1);
	}else{
		System.out.print(str2);
	}
}
}
