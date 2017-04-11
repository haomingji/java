import java.util.InputMismatchException;
import java.util.Scanner;


public class Util {
	@SuppressWarnings("resource")
	public static int getint(){
 
 while(true){
   try {
    	Scanner scan=new Scanner(System.in);
		int result= scan.nextInt();
		return result;
	}catch (InputMismatchException e) {
		System.out.println("±ØÐëÊÇÊý×Ö");
	} 
    }
    
     
}
}
