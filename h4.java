package homework14;

import java.util.Scanner;

public class h4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	for(int i=0;;i++){
	String str = scan.next();
	if(str.lastIndexOf("a")==str.length()-1){
		System.out.print("合法");
		System.out.println();
	}else{
		System.out.print("重新输入");
		System.out.println();
	}
	}
}
}
