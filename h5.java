package homework14;

import java.util.Scanner;

public class h5 {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	String  str =scan.next();
	int temp=0;
	for(int i=0;;i++){
	 if(str.indexOf("中国")>=0){
	 temp=temp+1;
	  str=str.substring(str.indexOf("中国")+2);
	 }
	 else{
		 break;
	 }
	}
	System.out.println(temp);
	scan.close();
}

}
