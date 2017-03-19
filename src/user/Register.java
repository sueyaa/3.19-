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
			System.out.println("用户数已达上限");
		}
	}
	
	public User register(){	
		System.out.println("欢迎注册！");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名");
		String userName = input.next();
		System.out.println("请输入密码");
		String password = input.next();
		System.out.println("请输入用户等级");
		String vipDegree = input.next();
		System.out.println("请输入姓名");
		String trueName = input.next();
		System.out.println("请输入性别");
		String gender = input.next();
		System.out.println("请输入年龄");
		int age = input.nextInt();
		System.out.println("请输入电话");
		long phoneNumber = input.nextLong();
		System.out.println("请输入地址");
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
		
		System.out.println("注册成功！");
		return user;
	
	}

}
