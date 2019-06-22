package com.cg.airplanereservationsystem.pl;

import java.util.Scanner;

import com.cg.airplanereservationsystem.bean.User;
import com.cg.airplanereservationsystem.service.ARSService;

public class Main {

	public static void main(String[] args) {
		ARSService service = new ARSService();
		System.out.println("Welcome to ARS");
		System.out.println("1. Please Sign-in if you are an existing user");
		System.out.println("2. Register if you are a new user");
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			while (true) {
				try {
					System.out.println("Enter User-Name");
					String userName = sc.next();
					System.out.println("Enter Password");
					String password = sc.next();
					boolean value = service.logIn(userName, password);
					if (value) {
						System.out.println("Welcome!!");
						break;
					} else
						System.out.println("Wrong Login Credentials re-enter ");
				} catch (Exception e) {
					System.out.println("Enter the Name Properly");
					break;
				}
			}
		case 2:

			User usr = new User();
			while (true) {
				try {
					System.out.println("Enter your Name");
					String name = sc.next();
					if (service.validateName(name)) {
						usr.setName(name);
						break;
					} else
						System.out
								.println("Enter the name in the correct format Like 'Atanu'");
				} catch (Exception e) {
					System.out.println("Enter the Name Properly");
					continue;
				}
			}
			while (true) {
				try {
					System.out.println("Enter your E-Mail id");
					String email = sc.next();
					if (service.validateEmail(email)) {
						usr.seteMail(email);
						break;
					} else
						System.out.println("Email pattern must be xyz@abc.com");
				} catch (Exception e) {
					System.out.println("Enter the Mail");
					continue;
				}
			}
			while (true) {
				try {
					System.out.println("Enter your Mobile Number");
					String mob = sc.next();
					if (service.validatePhone(mob)) {
						usr.setMobileNo(mob);
						break;
					} else
						System.out
								.println("Phone Number must contain 10 digit");
				} catch (Exception e) {
					System.out.println("Enter the Phone Number");
					continue;
				}
			}
			System.out.println("Enter a Username");
			String uname = sc.next();
			usr.setUserName(uname);
			System.out.println("Enter your password");
			String pwd = sc.next();
			usr.setPassword(pwd);
			service.signUp(usr);
			System.out.println("Welcome to ARSs" + usr.getName());
			break;

		}

	}
}