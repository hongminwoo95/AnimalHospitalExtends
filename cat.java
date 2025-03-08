package main;

import java.util.Scanner;

public class cat extends Super {
	private String name;
	private int age;
	Scanner s = new Scanner(System.in);
	
	public cat() {
		
	}

	@Override
	public void menu() {
		System.out.println("보호자의 이름을 입력해주세요");
		String name = s.nextLine();
		System.out.println("보호자의 주소를 입력해주세요");
		String addr = s.nextLine();
		super.name=name;
		super.addr=addr;
		boolean flag = true;
		while (flag) {
			System.out.println("1.등록 ");
			int num = s.nextInt();
			s.nextLine();
			switch (num) {
			case 1: add(); break;
			default : flag = false;
			}
		}
	}
	@Override
	public void prt() {
		// TODO Auto-generated method stub
		super.prt();
		System.out.println("고양이 이름 : "+name);
		System.out.println("고양이 나이 : "+age);
	}

	public void add() { // 등록
		System.out.println("고양이의 이름을 입력해주세요");
		String name = s.nextLine();
		this.name=name;
		System.out.println("고양이의 나이를 입력해주세요");
		int age = s.nextInt();
		s.nextLine();
		this.age=age;
		
	}
	
	
}
