package homework14;

public class h9 {
	public static void main(String[] args) {
	int [][] a =new int[][]{{17,24,1,8,15},{23,5,7,14,16},{4,6,13,20,22},{10,12,19,21,3},{11,18,25,2,9}};
	int sum1=0;
	int sum2=0;
	int sum3=0;
	int sum4=0;
	int sum5=0;
	int sum6=0;
	int sum7=0;
	int sum8=0;
	int sum9=0;
	int sum10=0;
	
	for(int i=0;i<a.length;i++){
		for (int j = 0; j < a[i].length; j++) {
			sum1=a[0][j]+sum1;
			sum2=a[1][j]+sum2;
			sum3=a[2][j]+sum3;
			sum4=a[3][j]+sum4;
			sum5=a[4][j]+sum5;
			sum6=a[i][0]+sum6;
			sum7=a[i][1]+sum7;
			sum8=a[i][2]+sum8;
			sum9=a[i][3]+sum9;
			sum10=a[i][4]+sum10;
		}
	}
	if(sum1==sum2&&sum2==sum3&&sum3==sum4&&sum4==sum5&&sum5==sum6&&sum6==sum7&&sum7==sum8&&sum8==sum9&&sum9==sum10){
	
	System.out.print("ÊÇ");
}else{
	System.out.print("²»ÊÇ");
}

}
}
