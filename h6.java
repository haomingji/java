package homework13;

public class h6 {
public static void main(String[] args) {
	int [] a=new int[]{1,2,3,4,5,56,89,0};
	for(int i=0;i<a.length/2;i++){
		int temp=a[i];
		a[i]=a[a.length-1-i];
		a[a.length-1-i]=temp;	
		}
	for(int val:a){
		System.out.print(val+" ");
	}
	}
}

