package main;

import java.util.Scanner;

public class dog extends Super{
	private String name;
	private String breed;
	Scanner s = new Scanner(System.in);
	
	public dog() {
		
	}

	@Override
	public void menu() {
		System.out.println("보호자 인적사항을 먼저 등록해주세요");
		System.out.println("보호자 이름");
		String name = s.nextLine();
		System.out.println("보호자 주소");
		String addr = s.nextLine();
		super.name=name;
		super.addr=addr;
		
		System.out.println("1.강아지등록");
		int num = s.nextInt();
		s.nextLine();
		boolean flag = true;
		while (flag) {
			switch(num) {
			case 1: add(); break;
			
			default : flag=false;
			}
		}
	}
	
	@Override
	public void prt() {
		// TODO Auto-generated method stub
		super.prt();
		System.out.println("강아지 이름 : "+name);
		System.out.println("강아지 종류 : "+breed);
	}

	public void add() {
		System.out.println("강아지 이름을 입력하세요");
		String nam1 = s.nextLine();
		this.name =name;
		System.out.println("강아지 견종을 입력하세요");
		String breea = s.nextLine();
		this.breed=breed;
		
	}
	
	
	
}
