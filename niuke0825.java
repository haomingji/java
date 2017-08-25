package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class niuke0825 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext()){
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String s1=String.valueOf(o1);
				String s2=String.valueOf(o2);
				return (s2+s1).compareTo(s1+s2);
			}
		});
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	 
	}
	

}
}
