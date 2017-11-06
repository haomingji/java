package test2;
public class Test1106 {
public static void main(String[] args) {
//	StringBuffer an= new StringBuffer();
//	String a="220104199503315016";
//	an.append(a);
//   for (int i = 6; i < an.length()-4; i++) {
//	   an.replace(i,i+1,"x");
//}
//    String pas=an.toString();
//	System.out.println(pas);
	Test1106 t=new Test1106();
	t.pas();
}

void pas(){
	char a[]=new char[18];
	String s="220104199503315016";
	char s1[]=s.toCharArray();
	for (int i = 0; i < a.length; i++) {
		a[i]=s1[i];
		if(i>=6&&i<14){
			a[i]='x';
		}
		
	}
	for (int j = 0; j < a.length; j++) {
		System.out.print(a[j]);
	}
	
}
}
