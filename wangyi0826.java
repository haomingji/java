package test2;

import java.util.Scanner;

public class wangyi0826 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext()){
		int n=scan.nextInt();
		int count=0;
		for (int i = 1; i<=n; i++) {
			int c1=convert(i, 2);
			int c2=convert(i,10);
			if(c1==c2){
				count++;
			}
		}
		System.out.println(count);
	}
	
	

	
}

private static int convert(int i, int m) {
	int count=0;
	while(i>0){
		count+=i%m;
		i=i/m;
	}
	return count;
}
}
