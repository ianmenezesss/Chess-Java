package program;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch game = new ChessMatch();

		while (true) {
			try {
				UserInterface.clearScreen();
				UserInterface.printBoard(game.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UserInterface.readChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UserInterface.readChessPosition(sc);

				ChessPiece capturedPiece = game.performChessMove(source, target);
				
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
