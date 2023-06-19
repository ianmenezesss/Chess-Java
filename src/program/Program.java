package program;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

	ChessMatch game = new ChessMatch();
	UserInterface.printBoard(game.getPieces());
		
	}
}
