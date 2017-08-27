package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class wangyi0827 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	ArrayList<Integer> list=new ArrayList<Integer>();
	ArrayList<Integer> list1=new ArrayList<Integer>();
	int m=scan.nextInt();
	int n=scan.nextInt();
	while(m>0){
		int x=m%10;
		list.add(x);
		m=m/10;
	}
	for (int i = list.size()-1; i >= 0; i--) {
		list1.add(list.get(i));
	}
	
	Collections.sort(list, new Comparator<Integer>(){

		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o1-o2;
		}
		
	});
	for (int i = 0; i <n; i++) {
		list.remove(0);
	}
	for (int i = 0; i < list1.size(); i++) {
		for (int j = 0; j < list.size(); j++) {
			if(list1.get(i)==list.get(j)){
				System.out.print(list1.get(i));
			}
		}
	}
	
	
}
}
