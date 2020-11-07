package net.htlgrieskirchen.pos3.sudoku;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Please enter here an answer to task four between the tags:
 * <answerTask4>
 *    Hier sollte die Antwort auf die Aufgabe 4 stehen.
 * </answerTask4>
 */
public class SudokuSolver implements ISodukoSolver {
    private int row;
    private int width;
    private int column;
    private int height;
    
    public SudokuSolver(int row, int width, int column, int height) {
        this.row = row;
        this.width = width;
        this.column = column;
        this.height = height;
    }

    SudokuSolver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final int[][] readSudoku(File file) {
        //List<Integer<String>> values = new Map<Integer<String>;
        try (Stream<String> lines = Files.lines(Paths.get("1_sudoku_level1"))) {
	   // values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
	//		values.forEach(value -> System.out.println(value));
		} catch (IOException e) {
			e.printStackTrace();
		}
        
       // int[][] data = new int[v][];
        
        return new int[0][0]; // delete this line!
    }

    @Override
    public boolean checkSudoku(int[][] rawSudoku) {
        
        for(int i = 0; i < width; i++){
            for(int j = 0; j < width; i++){
                if(rawSudoku[row][i] == rawSudoku[row][j]){
                    return false;
                }
            }
        }
        
        for(int i = 0; i < height; i++){
            for(int j = i + 1; j < height; j++){
                if(rawSudoku[i][column] == rawSudoku[j][column]){
                 return false;
                }        
        }
    }
        
          return true;
    }

    @Override
    public int[][] solveSudoku(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }
    
    @Override
    public int[][] solveSudokuParallel(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }

    // add helper methods here if necessary
}
