package application;

import chess.ChessMatch;

public class Principal {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
			UI.printBoard(chessMatch.getPieces());
		
	}

}
