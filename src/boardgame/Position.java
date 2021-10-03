package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	//object é uma superclasse de todas as classes
	//quando vc faz o tostring
	//vc sobrescreve a classe to sting 
	//que é da classe object
	@Override
	public String toString() {
		return row +","+ column;
	}
	
	
}
