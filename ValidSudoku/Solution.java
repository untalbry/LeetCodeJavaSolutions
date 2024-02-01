package ValidSudoku;

public class Solution {
     //| RunTime : 1 ms | Memory: 44.24 MB
    public static void main(String[] args) {
        char[][] matriz = {
            {'8','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}       
        };
        System.out.println(isValidSudoku(matriz));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            char fila[] = board[i];
            if (containsDuplicate(fila)) {
                return false;
            }
            char columna[] = obtenerColumna(board, i);
            if (containsDuplicate(columna)) {
                return false;
            }

        }
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                if (subBoxContainsDuplicates(board, i, i + 2, j, j + 2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static char[] obtenerColumna(char[][] sudoku, int n) {
        char[] columna = new char[sudoku.length];
        for (int y = 0; y < sudoku.length; y++) {
            columna[y] = sudoku[y][n];
        }
        return columna;
    }

    public static boolean subBoxContainsDuplicates(char[][] sudoku, int filaInicio, int filaFin, int columnaInicio,
            int columnaFin) {
        char[] list = new char[1];
        boolean hasDuplicate = false;
        int i = 1;
        list[0] = sudoku[columnaInicio][filaInicio];
        for (int y = columnaInicio; y <= columnaFin && !hasDuplicate; y++) {
            for (int x = filaInicio; x <= filaFin && !hasDuplicate; x++) {
                if ((x == filaInicio && y == columnaInicio) || sudoku[y][x] == '.')
                    continue;
                hasDuplicate = isIn(list, sudoku[y][x]);
                if (!hasDuplicate) {
                    list = copyToNewArray(list);
                    list[i] = sudoku[y][x];
                    i++;
                }
            }
        }
        return hasDuplicate;
    }

    public static boolean isIn(char[] list, char x) {
        for (int i = 0; i < list.length; i++) {
            if (x == list[i])
                return true;
        }
        return false;
    }

    public static boolean containsDuplicate(char[] list) {
        for (int j = 0; j < list.length; j++) {
            if (list[j] == '.')
                continue;
            for (int i = j + 1; i < list.length; i++) {
                if (list[j] == list[i])
                    return true;
            }
        }
        return false;
    }

    public static char[] copyToNewArray(char[] oldArray) {
        char[] newArray = new char[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

}
