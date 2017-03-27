package test;

public class test2 {
	public static void main(String[] args){
		int[][] a=new int[6][6];
		int t=0;
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				t=t+1;
				a[i][j]=t;
				System.out.print(a[i][j]+"\t");
				if(i==j||i+j==5){
					sum=sum+t;
				}
			}System.out.println();
					
				}
		System.out.print(sum);
		}
	}


