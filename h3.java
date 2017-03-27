package homework13;

public class h3 {
	public static void main(String[] args) {
		h("220104199503305000");
	}
   static void h(String s){
    	int a=s.length();
    	int sex=0;//Å®Îª0£»ÄÐÎª1
    	if(a==15){
    		sex=Integer.parseInt(s.substring(13,14))%2;
    	}if(a==18){
    		sex=Integer.parseInt(s.substring(16,17))%2;
    	}
	System.out.println(sex);
}
}
