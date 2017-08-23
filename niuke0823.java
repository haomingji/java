package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class niuke0823 {
	

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
List<Integer> list = new ArrayList<Integer>();
List<Integer> list1 = new ArrayList<Integer>();
while(sc.hasNext()){
int n = sc.nextInt();
int m = sc.nextInt();
int sum = 0;
		boolean flag = false;
		for(int i=n;i<=m;i++){
		fun(i,list);
		for(int j:list){
		sum += j*j*j;
}
		if(sum==i){
		list1.add(i);
		flag = true;
		}
		sum = 0;
		}
		if(!flag){
		System.out.print("no");
		}else{
		for(int i=0;i<list1.size();i++){
		System.out.print(list1.get(i));
	if(i<list1.size()-1)
		System.out.print(" ");
}
		}
          list1.clear();
}
}


public  static void fun(int m,List list){
	list.clear();
	while(m>0){
		list.add(m%10);
		m=m/10;
	}
}
		
}

