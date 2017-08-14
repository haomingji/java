package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class le {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	int index=1;
	int length=0;
	List<Integer> m=new ArrayList<Integer>() ;
	if(s.equals("1")){
		length=1;
	}
	if(s.length()>1){
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)!=s.charAt(i+1)){
				index++;
				if(i+1==s.length()-1){
					m.add(index);
				}
		}
			else if(s.charAt(i)==s.charAt(i+1)){
				m.add(index);
				index=1;
			}
		}
	}
	
	
	for (int i = 0; i < m.size(); i++) {
		
		if(m.get(i)>length){
			length=m.get(i);
			
		}
	}
	System.out.println(length);
}
}
