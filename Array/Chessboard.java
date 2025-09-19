public class Chessboard {
    public static void main(String[] args) {
        char[][] chess = {
            {'.', '.', '.', 'K', 'Q', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'Q', 'K', '.', '.', '.'}
        };
        // chess[1][4]='Q ';
        // chess[0][4]='.';
        for(int i = 0; i < chess.length; i++) {
            for(int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
    
