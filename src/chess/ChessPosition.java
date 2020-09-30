package chess;

import boardgame.position;

public class ChessPosition {
	
	private int column;
	private int row;
	
	public ChessPosition(int column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition: Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected position toPosition() {
		return new position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(position Position) {
		return new ChessPosition((char)('a' + Position.getColumn()), 8 - Position.getRow() );
	}

	@Override
	public String toString() {
		return "" + column + row;
	}
}
