package in.nikhil.project.tictactoe;

public class Cell {
private final int row;
private final  int col;
private Symbol symbol;
public Cell(int row,int col,Symbol symbol) {
	this.row = row;
	this.col =col;
	symbol = null;
}
public int getCellNumber() {
	return this.row;
}
public int getColNumber() {
	return this.col;
}
public Symbol getCellSymbol() {
	return this.symbol;
}
public void setCellSymbol(Symbol symbol) {
	this.symbol = symbol;
}
}
