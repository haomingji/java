package homework13;

import java.util.Spliterator;

public class h11 {
public static void main(String[] args) {
	String a="01#张三#20-02#李四#30-03#王五#40";
	String b[]=a.split("-");
	int total=0;
       for(int i=0;i<b.length;i++){
    	   String c[]=b[i].split("#");
    	   String id=c[0];
    	   String name=c[1];
    	   String score=c[2];
    	   total=total+Integer.parseInt(score);
    	   System.out.println(id+" "+name+" "+score);
    	   }
    	System.out.print(total);
		
	}
}


