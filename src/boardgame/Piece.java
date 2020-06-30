package boardgame;

public abstract class Piece {
	
	protected position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	public abstract boolean[][] possibleMoves();
	
	public boolean posssibleMovie(position position) {
		return possibleMovie()[position.getRow()][position.getColumn()];
	}

	public boolean[][] isThereAnyPossibleMovie(){
		boolean[][] mat = possibleMoves();
		for(int i = 0; i<mat.lenght; i++) {
			for(int j = 0; j<mat.lenght; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
