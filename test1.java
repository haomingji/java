package test;

public class test1 {
	public static void main(String[] args){
		test1 t=new test1();
		
		int[] a=new int[20];
		for(int i=0;i<a.length;i++){
			a[i]=t.f(i+1);
		}
		for(int val:a){
			System.out.print(val+" ");
		}
	}
	int f(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return f(n-1)+f(n-2);
		}
	}

}
