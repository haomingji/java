package homework13;

public class h8 {
	public static void main(String[] args) {
		h("shxt_0505");
	}
static void h(String s){
	if(s.indexOf("shxt_")==0){
		int a=Integer.parseInt(s.substring(s.length()-4));
		if(a<10000&&a>=0){
			int b=Integer.parseInt(s.substring(s.length()-4,s.length()-2));
			if(b>6&&a<=2017){
				System.out.print("合法");
			}
			else{
				System.out.print("不合法");
		}
	}
		else{
			System.out.print("不合法");
		}
	}
		else{
		System.out.print("不合法");
	}
	

}
}
