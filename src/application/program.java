package application;

import java.util.Scanner;

import boardgame.position;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		position pos = new position(3, 5);
		System.out.println(pos);
		
		sc.close();

	}

}
