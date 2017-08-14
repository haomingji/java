package test1;

import java.util.Scanner;

public class main2 {
public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 String a1 = scan.nextLine();
 String [] a11 = a1.split(" ");
 int n=Integer.parseInt(a11[0]);//数列长度
 int k=Integer.parseInt(a11[1]);//范围
 int sum=0;
 boolean tag=true;
 int []a=new int[n];
	for (int i = 1; i <n; i++) {
		for (int j = 1; j <=k; j++) {
			if(tag){
				a[i-1]=j;
			}
			
		  for (int j2 = 1; j2 <=k; j2++) {
			if(j<=j2||j%j2!=0){
				a[i]=j2;
				if(i+1==n){
					sum++;
					tag=true;
				}else{
					tag=false;
				}
			}
		}
		}
		tag=true;
	}
	System.out.println(sum);
}
}
