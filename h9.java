package homework13;

public class h9 {
	public static void main(String[] args){
		String[] name=new String[]{"wangwu","zhangsan","lisi","yangshuxin"};
		 for(int i=0;i<name.length;i++){
			 for(int j=0;j<name.length-1-i;j++){
				 if(name[j].compareTo(name[j+1])>0){
					 String temp=name[j];
					 name[j]=name[j+1];
					 name[j+1]=temp;
				 }
			 }
		 }
		 for (int i = 0; i < name.length; i++) {
			 System.out.print(name[i]+" ");
			
		}
		   }
	}

