package h15;

import java.util.ArrayList;

public class h2 { 
	public static void main(String[] args) {
		T t =new T();
		t.addandsort(9);
	}

}
class T{
	ArrayList<Integer > alist =new ArrayList<Integer > ();
	public void addandsort(int element){
		alist.add(1);
		alist.add(3);
		alist.add(5);
		alist.add(6);
		alist.add(element);
		for (int i = 0; i < alist.size(); i++) {
			for (int j = 0; j < alist.size()-1-i; j++) {
				if(alist.get(j)<alist.get(j+1)){
					int temp=alist.get(j);
					alist.set(j, alist.get(j+1));
					alist.set(j+1, temp);
				}
			}
		}for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i)+" ");
		}
	}
}