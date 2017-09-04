package test2;

public class niuke0904 {
public static void main(String[] args) {
	niuke0904 n=new niuke0904();
	System.out.println(n.f1(4));
}

public int f1(int n){
	if(n<=0){
		return 0;
	}
	if(n==1){
		return 1;
	}
	if(n==2){
		return 2;
	}
	
		int first=1;
		int second=2;
		int third=0;
		for (int i = 3; i <=n; i++) {
			third=first+second;
			first=second;
			second=third;
		}
		return third;
}
}
