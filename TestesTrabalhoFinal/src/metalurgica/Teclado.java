package metalurgica;

import java.util.Scanner;

public class Teclado {
	
	long keyboardLng(String msg){
		Scanner t = new Scanner(System.in);
		System.out.print(msg);
		long n = t.nextLong();
		return n;
		
		
	}
	
	String keyboardStr(String msg) {
		Scanner t = new Scanner(System.in);
		System.out.print(msg);
		String s = t.next();
		return s;
	}
	
	Float keyboardFlt(String msg) {
		Scanner t = new Scanner(System.in);
		System.out.print(msg);
		Float f = t.nextFloat();
		return f;
	}
}