import java.awt.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ATMtest {
	public static void main(String[] args) {
	 M m =new M();
	 m.init();
	 m.login();
	 m.item();
}
}
class User{
	int num;
	String name;
	int password;
	int balance=0;
	public User( int num, int password,int balance) {
		super();
		this.num = num;
		this.password = password;
		this.balance=balance;
	}
	
}
class M{
	ArrayList<User> userList = new ArrayList<User>();
	int pos=-1;
	void init(){
		User u1=new User(1,21140401,1000);
		User u2=new User(2, 21140402,1000);
		User u3=new User(3, 21140403,1000);
		User u4=new User(4, 21140404,1000);
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
	}
	void getmoney(){
		User user=userList.get(pos);
		System.out.println("ȡ����Ǯ");
		int money=Util.getint();
		if(user.balance-money>=0){
			user.balance=user.balance-money;
		}else {
			System.out.println("����");
		}
		
	}
	void savemoney(){
		User user=userList.get(pos);
		System.out.println("�����Ǯ");
		int money=Util.getint();
		user.balance=user.balance+money;
		System.out.println("���ɹ�");
	}void query(){
		User user=userList.get(pos);
		System.out.println("���Ϊ"+user.balance);
	}
	boolean login(){
		Scanner scan=new Scanner(System.in);
		System.out.println("����");
			int str=Util.getint();
			System.out.println("����������");
			int m=Util.getint();
			
		for (int i = 0; i < userList.size(); i++) {
			User u=userList.get(i);
			if(str==u.num&&u.password==m){
				 pos=i; 
				return true;
			}
	}System.out.println("�û��������벻��ȷ����������");
	 return false;
	}
	void item(){
		boolean tag=login();
		while(tag){
			System.out.println("��½�ɹ�");
			System.out.println("1�� 2ȡ 3�鿴 4�˳�");
			int i=Util.getint();
			switch (i) {
			case 1:savemoney();query();break;
			case 2:getmoney();query();break;
			case 3:query();
			case 4:tag=false;break;
			}
		}
	}
	
}