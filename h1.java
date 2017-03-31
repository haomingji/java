package h15;

import java.util.ArrayList;

public class h1 {
	public static void main(String[] args) {
		ArrayList<Integer> aList=new ArrayList<Integer>();
		aList.add(23);
		aList.add(43);
		aList.add(66);
		aList.add(87);
		aList.add(26);
		aList.add(54);
		aList.add(87);
		aList.add(2);
		for (int i = 0; i < aList.size(); i++) {
			for (int j = 0; j < aList.size()-1-i; j++) {
				if( aList.get(j)>aList.get(j+1)){
					int temp=aList.get(j);
					aList.set(j,aList.get(j+1));
					aList.set(j+1, temp);
				}
			}
		}for(int i=0;i<aList.size();i++){
		System.out.print(aList.get(i)+" ");
		}
	}
}
