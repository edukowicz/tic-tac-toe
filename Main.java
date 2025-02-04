public class Main{
   
    public static void printBoard(String[][] board) {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
    public static String swap(String turn) {
        if(turn.equals("X")) {
            return "O";
        }
        else {
            return "X";
        }
    }
    public static void main(String[] args) {
        String[][] board = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        printBoard(board);

        String playerTurn = "X";
    }
}