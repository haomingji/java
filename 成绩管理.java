
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class homework19 {
public static void main(String[] args) {
	method m=new method();
	m.f1();
	m.f2();
	m.f3();
	m.f4();
	m.f5();
	

}
}

class method{
	void f1(){
		ArrayList<HashMap<String, Integer>> list=new ArrayList<HashMap<String,Integer>>();
		HashMap<String, Integer> map1=new HashMap<String, Integer>();
		map1.put("张三", 80);
		map1.put("李四", 65);
		map1.put("王五", 35);
		map1.put("薛六", 90);
		map1.put("赵七", 70);
		HashMap<String, Integer> map2=new HashMap<String, Integer>();
		map2.put("张三", 88);
		map2.put("李四", 75);
		map2.put("王五", 45);
		map2.put("薛六", 92);
		map2.put("赵七", 75);
		HashMap<String, Integer> map3=new HashMap<String, Integer>();
		map3.put("张三", 86);
		map3.put("李四", 67);
		map3.put("王五", 55);
		map3.put("薛六", 98);
		map3.put("赵七", 65);
		HashMap<String, Integer> map4=new HashMap<String, Integer>();
		map4.put("张三", 88);
		map4.put("李四", 80);
		map4.put("王五", 59);
		map4.put("薛六", 88);
		map4.put("赵七", 68);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		scan.close();
		int sum=0;
		switch (m) {
		case 1:
			HashMap<String, Integer> a=list.get(0);
			 Set<Entry<String,Integer>> set1=a.entrySet();
			 Iterator<Entry<String,Integer>> it1 =  set1.iterator();
			 while( it1.hasNext()){
				 Entry<String,Integer> en1=it1.next();
				 int i1=en1.getValue();
				 sum=sum+i1;
			}System.out.println("总成绩为"+sum);
			break;
		case 2:HashMap<String, Integer> b=list.get(1);
		 Set<Entry<String,Integer>> set2=b.entrySet();
		 Iterator<Entry<String,Integer>> it2 =  set2.iterator();
		 while( it2.hasNext()){
			 Entry<String,Integer> en2=it2.next();
			 int i2=en2.getValue();
			 sum=sum+i2;
		}System.out.println("总成绩为"+sum);
		break;
		case 3:
			HashMap<String, Integer> c=list.get(2);
		 Set<Entry<String,Integer>> set3=c.entrySet();
		 Iterator<Entry<String,Integer>> it3=  set3.iterator();
		 while( it3.hasNext()){
			 Entry<String,Integer> en3=it3.next();
			 int i3=en3.getValue();
			 sum=sum+i3;
		}System.out.println("总成绩为"+sum);
		break;
		case 4:
			HashMap<String, Integer> d=list.get(3);
		 Set<Entry<String,Integer>> set4=d.entrySet();
		 Iterator<Entry<String,Integer>> it4 =  set4.iterator();
		 while( it4.hasNext()){
			 Entry<String,Integer> en4=it4.next();
			 int i4=en4.getValue();
			 sum=sum+i4;
		}System.out.println("总成绩为"+sum);
		break;
		default:
			System.out.println("没有进行该次考试");
		    break;
		
	}
}void f2(){
	ArrayList<HashMap<String, Integer>> list=new ArrayList<HashMap<String,Integer>>();
	HashMap<String, Integer> map1=new HashMap<String, Integer>();
	map1.put("张三", 80);
	map1.put("李四", 65);
	map1.put("王五", 35);
	map1.put("薛六", 90);
	map1.put("赵七", 70);
	HashMap<String, Integer> map2=new HashMap<String, Integer>();
	map2.put("张三", 88);
	map2.put("李四", 75);
	map2.put("王五", 45);
	map2.put("薛六", 92);
	map2.put("赵七", 75);
	HashMap<String, Integer> map3=new HashMap<String, Integer>();
	map3.put("张三", 86);
	map3.put("李四", 67);
	map3.put("王五", 55);
	map3.put("薛六", 98);
	map3.put("赵七", 65);
	HashMap<String, Integer> map4=new HashMap<String, Integer>();
	map4.put("张三", 88);
	map4.put("李四", 80);
	map4.put("王五", 59);
	map4.put("薛六", 88);
	map4.put("赵七", 68);
	list.add(map1);
	list.add(map2);
	list.add(map3);
	list.add(map4);
	int sum=0;
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	
	while(str.equals("张三")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			Set<String> keys=a.keySet();
			Iterator<String> it1=keys.iterator();
			while(it1.hasNext()){
				String s1=it1.next();
				if(s1.equals("张三")){
					sum=sum+a.get(s1);
				}
			}
		}System.out.println("他的总成绩为"+sum);
		break;
	}
	while(str.equals("李四")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			Set<String> keys=a.keySet();
			Iterator<String> it1=keys.iterator();
			while(it1.hasNext()){
				String s1=it1.next();
				if(s1.equals("李四")){
					sum=sum+a.get(s1);
				}
			}
		}System.out.println("他的总成绩为"+sum);
		break;
	}
	while(str.equals("王五")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			Set<String> keys=a.keySet();
			Iterator<String> it1=keys.iterator();
			while(it1.hasNext()){
				String s1=it1.next();
				if(s1.equals("王五")){
					sum=sum+a.get(s1);
				}
			}
		}System.out.println("他的总成绩为"+sum);
		break;
	}
	while(str.equals("薛六")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			Set<String> keys=a.keySet();
			Iterator<String> it1=keys.iterator();
			while(it1.hasNext()){
				String s1=it1.next();
				if(s1.equals("薛六")){
					sum=sum+a.get(s1);
				}
			}
		}System.out.println("他的总成绩为"+sum);
		break;
	}
	while(str.equals("赵七")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			Set<String> keys=a.keySet();
			Iterator<String> it1=keys.iterator();
			while(it1.hasNext()){
				String s1=it1.next();
				if(s1.equals("赵七")){
					sum=sum+a.get(s1);
				}
			}
		}System.out.println("他的总成绩为"+sum);
		break;
	}
}
void f3(){
	ArrayList<HashMap<String, Integer>> list=new ArrayList<HashMap<String,Integer>>();
	HashMap<String, Integer> map1=new HashMap<String, Integer>();
	map1.put("张三", 80);
	map1.put("李四", 65);
	map1.put("王五", 35);
	map1.put("薛六", 90);
	map1.put("赵七", 70);
	HashMap<String, Integer> map2=new HashMap<String, Integer>();
	map2.put("张三", 88);
	map2.put("李四", 75);
	map2.put("王五", 45);
	map2.put("薛六", 92);
	map2.put("赵七", 75);
	HashMap<String, Integer> map3=new HashMap<String, Integer>();
	map3.put("张三", 86);
	map3.put("李四", 67);
	map3.put("王五", 55);
	map3.put("薛六", 98);
	map3.put("赵七", 65);
	HashMap<String, Integer> map4=new HashMap<String, Integer>();
	map4.put("张三", 88);
	map4.put("李四", 80);
	map4.put("王五", 59);
	map4.put("薛六", 88);
	map4.put("赵七", 68);
	list.add(map1);
	list.add(map2);
	list.add(map3);
	list.add(map4);
	
	int sum=0;
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	while(s.equals("张三")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			     Set<String> keys=a.keySet();
			     Iterator<String> it = keys.iterator();
			     while(it.hasNext()){
			    	 String s1=it.next();
			    	 if(s1.equals("张三")){
			    		 sum=sum+a.get(s1);
			    	 }
			     }
		}
		double aver=sum/4;
		System.out.println("他的平均成绩为"+aver);
		break;
	}
	while(s.equals("李四")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			     Set<String> keys=a.keySet();
			     Iterator<String> it = keys.iterator();
			     while(it.hasNext()){
			    	 String s1=it.next();
			    	 if(s1.equals("李四")){
			    		 sum=sum+a.get(s1);
			    	 }
			     }
		}
		double aver=sum/4;
		System.out.println("他的平均成绩为"+aver);
		break;
	}
	while(s.equals("王五")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			     Set<String> keys=a.keySet();
			     Iterator<String> it = keys.iterator();
			     while(it.hasNext()){
			    	 String s1=it.next();
			    	 if(s1.equals("王五")){
			    		 sum=sum+a.get(s1);
			    	 }
			     }
		}
		double aver=sum/4;
		System.out.println("他的平均成绩为"+aver);
		break;
	}
	while(s.equals("薛六")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			     Set<String> keys=a.keySet();
			     Iterator<String> it = keys.iterator();
			     while(it.hasNext()){
			    	 String s1=it.next();
			    	 if(s1.equals("薛六")){
			    		 sum=sum+a.get(s1);
			    	 }
			     }
		}
		double aver=sum/4;
		System.out.println("他的平均成绩为"+aver);
		break;
	}
	while(s.equals("赵七")){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Integer> a=list.get(i);
			     Set<String> keys=a.keySet();
			     Iterator<String> it = keys.iterator();
			     while(it.hasNext()){
			    	 String s1=it.next();
			    	 if(s1.equals("赵七")){
			    		 sum=sum+a.get(s1);
			    	 }
			     }
		}
		double aver=sum/4;
		System.out.println("他的平均成绩为"+aver);
		break;
	}
	
}
void f4(){
	ArrayList<HashMap<String, Integer>> list=new ArrayList<HashMap<String,Integer>>();
	HashMap<String, Integer> map1=new HashMap<String, Integer>();
	map1.put("张三", 80);
	map1.put("李四", 65);
	map1.put("王五", 35);
	map1.put("薛六", 90);
	map1.put("赵七", 70);
	HashMap<String, Integer> map2=new HashMap<String, Integer>();
	map2.put("张三", 88);
	map2.put("李四", 75);
	map2.put("王五", 45);
	map2.put("薛六", 92);
	map2.put("赵七", 75);
	HashMap<String, Integer> map3=new HashMap<String, Integer>();
	map3.put("张三", 86);
	map3.put("李四", 67);
	map3.put("王五", 55);
	map3.put("薛六", 98);
	map3.put("赵七", 65);
	HashMap<String, Integer> map4=new HashMap<String, Integer>();
	map4.put("张三", 88);
	map4.put("李四", 80);
	map4.put("王五", 59);
	map4.put("薛六", 88);
	map4.put("赵七", 68);
	list.add(map1);
	list.add(map2);
	list.add(map3);
	list.add(map4);
	int sum=0;
	int k=0;
	double aver=0;
	double[] average=new double[4];
	for (int i = 0; i < list.size(); i++) {
		HashMap<String, Integer> a = list.get(i);
		Collection<Integer> coll=a.values();
		Iterator<Integer> it = coll.iterator();
		while(it.hasNext()){
			int score= it.next();
			 sum=sum+score;
		}  aver=sum/5;
		average[i]=aver;
		sum=0;
	}
	
	for (int i = 0; i < average.length; i++) {
		if (average[i]>average[k]) {
			k=i;
		}
	}System.out.print("第"+(k+1)+"次平均分最高，分为");
	System.out.println(average[k]);
}
void f5(){
	ArrayList<HashMap<String, Integer>> list=new ArrayList<HashMap<String,Integer>>();
	HashMap<String, Integer> map1=new HashMap<String, Integer>();
	map1.put("张三", 80);
	map1.put("李四", 65);
	map1.put("王五", 35);
	map1.put("薛六", 90);
	map1.put("赵七", 70);
	HashMap<String, Integer> map2=new HashMap<String, Integer>();
	map2.put("张三", 88);
	map2.put("李四", 75);
	map2.put("王五", 45);
	map2.put("薛六", 92);
	map2.put("赵七", 75);
	HashMap<String, Integer> map3=new HashMap<String, Integer>();
	map3.put("张三", 86);
	map3.put("李四", 67);
	map3.put("王五", 55);
	map3.put("薛六", 98);
	map3.put("赵七", 65);
	HashMap<String, Integer> map4=new HashMap<String, Integer>();
	map4.put("张三", 88);
	map4.put("李四", 80);
	map4.put("王五", 59);
	map4.put("薛六", 88);
	map4.put("赵七", 68);
	list.add(map1);
	list.add(map2);
	list.add(map3);
	list.add(map4);
	Scanner scan= new Scanner(System.in);
	String name= scan.next();
	int m= scan.nextInt();
	
		HashMap<String, Integer> a = list.get(m-1);
		Set<Entry<String, Integer>> set = a.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()){
		Entry<String, Integer> en = it.next();
		int score=en.getValue();
		String s1=en.getKey();
		if(name.equals(s1)){
		System.out.println(s1+"的第"+m+"次成绩是"+score);
		break;
		}
		}
	}
	}


