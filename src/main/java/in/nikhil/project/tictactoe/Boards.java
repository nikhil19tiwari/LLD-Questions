package in.nikhil.project.tictactoe;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Boards {

	private Cell[][] cell;
	private List<Player> player;
	private AtomicInteger trackSize = new AtomicInteger(0);
	private final int size;
	
	public Boards(Cell[][] cell,List<Player> player) {
		this.cell = cell;
		this.player = player;
		this.size =cell.length; 
	}
	public void doStep() {
	Queue<Player> q = new LinkedList<>();
	for(Player p : player) {q.add(p);}
	while(true) {
		Scanner sc = new Scanner(System.in);
		Player p = q.peek();
		System.out.println("Enter row: column :"+p.getName());
		int row = sc.nextInt();
		int col = sc.nextInt();
//		String input = sc.next();
//		Symbol symbol = Symbol.valueOf(input.toUpperCase());
		boolean check = CheckFilled(row,col,p.getSymbol());
		if(check) {
			Cell cell = this.cell[row][col];
			cell.setCellSymbol(p.getSymbol());
			trackSize.incrementAndGet();
			System.out.println(p.getName()+" you put on row " +row+" and cell "+col+" with Symbol "+cell.getCellSymbol());
			q.poll();
			if(wins(row,col,p.getSymbol())) {
				System.out.println("Hurrah !! Player: "+p.getName() +" wins the game");
				break;
			}
			else if (trackSize.get() == (this.size * this.size)) {
			    System.out.println("All Cell Got Filled no any player win TIE mathch play Again");
			    break;
			} 
			else {
				q.add(p);
			}
		}
		else {
			if(trackSize.equals(this.size)) {
				System.out.println("All Cell Got Filled no any player win TIE mathch play Again");
				break;
			}
			System.out.println("This Cell Already filled try another ! ");
			continue;
		}
	}
	
	}
	public int rowIndex(int curr,int n) {
		return curr/3;
	}
	public int colIndex(int curr,int n) {
		return curr%3;
	}
	public boolean wins(int row,int col,Symbol symbol) {
		int bordSize =this.cell.length;
		int rowCount =0,colCount=0;
		boolean rowWin=true,colWin=true,diagonalWin=true,anti_DiagonalWin=true;
		for(int i=0;i<bordSize;i++) {
			if(this.cell[row][i].getCellSymbol() != symbol) {
				rowWin= false;
			break;
		  }
		}
		for(int i=0;i<bordSize;i++) {
			if(this.cell[i][col].getCellSymbol() != symbol) {
				colWin= false;
				break;
			}
		}
		for(int i=0;i<bordSize;i++) {
			if(this.cell[i][i].getCellSymbol() != symbol) {
				diagonalWin= false; 
				break;
				}
		}
		for (int i = 0; i < bordSize; i++) {
	        if (this.cell[i][bordSize - 1 - i].getCellSymbol() != symbol) {
	        	anti_DiagonalWin=false;
	        	break;
	        }
	    }
		return rowWin || colWin|| diagonalWin || anti_DiagonalWin;
	}
	public boolean CheckFilled(int row,int col,Symbol symbol) {
		if(row<0 ||row>=this.size || col<0 || col>=this.size)return false;
		Cell cell = this.cell[row][col];
		return cell.getCellSymbol() == null;
	}
	
}
