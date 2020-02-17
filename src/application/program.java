package application;

import java.util.Scanner;

import boardgame.position;
import chess.ChessMatch;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessmatch = new ChessMatch();
		
		UI.printBoard(chessmatch.getPieces());
		
		sc.close();

	}

}
