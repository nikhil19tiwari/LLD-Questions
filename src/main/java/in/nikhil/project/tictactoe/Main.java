package in.nikhil.project.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the bordSize: ");
	int bordSize = sc.nextInt();
	Cell cell[][] = new Cell[bordSize][bordSize];
	for(int i=0;i<bordSize;i++) {
		for(int j=0;j<bordSize;j++) {
			Cell singleCell = new Cell(i, j, null);
			cell[i][j] = singleCell;
		}
	}

	List<Player> list = new ArrayList<>();
    list.add(new Player(0,"Nikhil",Symbol.X));
    list.add(new Player(0,"Ram",Symbol.O));
	Boards bord = new Boards(cell, list);
	bord.doStep();
}
}
