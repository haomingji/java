package homework13;

public class h10 {
	public static void main(String[] args) {
		String[] name=new String[]{"jihaoming","wagnwu","zhangsan","lisi","yangshuxin"};
		for(int i=0;i<name.length;i++){
			if(name[i]=="zhangsan"){
				for(int j=i+1;j<name.length;j++){
				name[j-1]=name[j];
			}
			}
		}
		for(int i=0;i<name.length-1;i++){
			System.out.print(name[i]+" ");
		}
	}

}
