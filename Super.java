package main;


public abstract class Super {
	String name;
	String addr;
	public Super() {
		
	}
	public abstract void menu();
	
	public void prt() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}
}

