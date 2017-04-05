package honmework16;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class h1 {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		LinkedList<Integer> outlist=new LinkedList<Integer>();
		
		for (int i = 0; i <4; i++) {
			int a =(int) (Math.random() * 10);
		    	list.add(i, a);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
			
		}
		for (int j = 0; j< 10; j++) {
			System.out.println("输入四个数，还有"+(10-j-1)+"次");
			if( j<9){
		
		
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			int m =scan.nextInt();
			
			outlist.add(i,m);
		}int temp=0;
		for (int i = 0; i < 4; i++) {
			if( outlist.get(i)==list.get(i)){
				temp++;
			}
		}if(temp==4){
			System.out.println("恭喜你答对了");
			break;
			}
		else {
			System.out.println("很遗憾答错了，但有"+temp+"个数字正确");
		}
		System.out.println("是否查看之前的输入");
		String b= scan.next();
		if(b.equals("是")){
		for (int i = 0; i < outlist.size(); i++) {
			
			if(i%4==0){
				System.out.print("\n"+ outlist.get(i)+" ");
				
			}else{
				System.out.print(outlist.get(i)+" ");
			}
		}
		System.out.println();
		}
	}if(j==9){
		System.out.println("猜测失败");
	}
		
		}	
		
		}
		
	}


