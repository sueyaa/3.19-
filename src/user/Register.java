package user;

import java.util.Scanner;
public class Register {
	final int MAX_VALUE = 1024;
	int a = 0;
	User[] user = new User[1024];
	
	
	public void isRegister(){
		if(a < MAX_VALUE){
			user[a++] = register();
		}else{
			System.out.println("�û����Ѵ�����");
		}
	}
	
	public User register(){	
		System.out.println("��ӭע�ᣡ");
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���");
		String userName = input.next();
		System.out.println("����������");
		String password = input.next();
		System.out.println("�������û��ȼ�");
		String vipDegree = input.next();
		System.out.println("����������");
		String trueName = input.next();
		System.out.println("�������Ա�");
		String gender = input.next();
		System.out.println("����������");
		int age = input.nextInt();
		System.out.println("������绰");
		long phoneNumber = input.nextLong();
		System.out.println("�������ַ");
		String address = input.next();
		
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setVipDegree(vipDegree);
		user.setTrueName(trueName);
		user.setGender(gender);
		user.setAge(age);
		user.setPhoneNumber(phoneNumber);
		user.setAddress(address);
		
		System.out.println("ע��ɹ���");
		return user;
	
	}

}
