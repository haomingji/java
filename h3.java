package homework14;

import java.util.Scanner;

public class h3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	for(int i=0;;i++){
		String str=scan.next(); 
		if(str.equals("exit")){
			break;
		}
		if(str.indexOf("a")==0){
			System.out.print(str);
			System.out.println();
		}
	 if(str.indexOf("b")==0){
		for(int j=0;j<2;j++){
			System.out.print(str+" ");
			System.out.println();
		}
		
	}
}
}
}
