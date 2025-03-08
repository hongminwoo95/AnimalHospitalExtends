package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	ArrayList<Super> dd = new ArrayList<>();
	Scanner s = new Scanner(System.in);

	public Admin() {
		Scanner s = new Scanner(System.in);
		System.out.println("동물병원입니다");
		System.out.println("1.동물등록 2.전체보기 ");
		boolean flag = true;
		while (flag) {
			int num = s.nextInt();
			s.nextLine();
			switch(num) {
			case 1: add(); break;
			case 2: serch(); break;
			default : flag=false;
			}
		}
	}
	public void add() {
		System.out.println("1.개 2.고양이");
			int num = s.nextInt();
			s.nextLine();
			Super a = null;
			switch(num) {
			case 1: a = new dog(); break; // 서브클래스 강아지 객체생성
			case 2: a = new cat(); break; 
			}
			a.menu(); // 호출
			dd.add(a); // 리스트에 서브클래스 저장
		}
	public void serch() {
		for (Super uu : dd) {
			uu.prt();
		}
		
	}
}
