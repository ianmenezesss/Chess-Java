package program;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch game = new ChessMatch();
		
		while (true) {
			UserInterface.printBoard(game.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UserInterface.readChessPosition(sc);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UserInterface.readChessPosition(sc);
													
			ChessPiece capturedPiece = game.performChessMove(source, target);
		}
	}
}
