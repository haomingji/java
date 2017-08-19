package test2;

import java.util.Arrays;
import java.util.Scanner;

public class baidu0818 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int []arr=new int[n];
	int t=0;
	int tag=0;
	int m=0;
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scan.nextInt();
}
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
	if(arr[i]>t){
		t=arr[i];
		tag++;
		if(tag==3){
			m=t;
		}
	}
	}
	if(tag>=3){
		System.out.println(m);
	}else{
		System.out.println("-1");
	}
	
}
}
