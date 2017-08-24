package test2;

import java.util.Scanner;

public class niuke0824 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext()){
		String s1=scan.nextLine();
		String arr1[]=s1.split(" ");
		for (int i = 0; i < arr1.length/2; i++) {
			String temp="";
			temp=arr1[i];
			arr1[i]=arr1[arr1.length-i-1];
			arr1[arr1.length-1-i]=temp;
			
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
			if(i!=arr1.length-1){
				System.out.print(" ");
			}
		}
	}
	

}
}
