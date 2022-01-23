package eecs1022.lab8.tictactoe.model;

public class Game {
    private String status;
    private String playerx;
    private String playero;
    private String[] order = new String[2];
    private String game_status = "continue";
    private int turns = 0;
    private char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
    };
    public Game(String player1, String player2) {
        this.playerx = player1;
        this.playero = player2;
        this.board = board;
        this.order = new String[]{playerx, playero};
        this.status = playerx +"'s turn to play...";
        this.game_status = game_status;
        this.turns = turns;
    }

    public String getCurrentPlayer() {
        return this.order[0];
    }

    public String getStatus() {
        return this.status;
    }


    public char[][] getBoard() {
        return this.board;
    }

    public void setWhoPlaysFirst(char symbol) {
        if (symbol == 'o'){
            this.order[0] = this.playero;
            this.order[1] = this.playerx;
            this.status = playero +"'s turn to play...";
        }
    }
    public void move(int r, int c) {
        if(this.game_status.equals("Win")){
            this.status = "Error: game is already over with a winner.";
        }

        else if (this.game_status.equals("Tie")){
            this.status = "Error: game is already over with a tie.";
        }

        else{
            if (r >= 1 && r<=3){
                if (c >= 1 && c<=3){
                    if (board[r-1][c-1] == '_'){
                        if (this.order[0].equals(this.playerx)){
                            this.board[r-1][c-1] = 'x';
                        }
                        else{
                            this.board[r-1][c-1] = 'o';
                        }
                        this.turns +=1;
                        this.game_status=check_game();
                        if (this.game_status.equals("Win")){
                            this.status = "Game is over with " + this.order[0] +" being the winner.";
                            this.order[0] = null;
                        }
                        else if (this.game_status.equals("Tie")){
                            this.status = "Game is over with a tie between "+ this.playerx + " and "+ this.playero + ".";
                            this.order[0] = null;
                        }
                        else{
                            String temp = this.order[0];
                            this.order[0] = order[1];
                            this.order[1] = temp;
                            this.status = this.order[0] +"'s turn to play...";
                        }

                    }
                    else{
                        this.status = "Error: slot @ ("+ r + ", "+  c + ") is already occupied.";
                    }
                }
                else{
                    this.status = "Error: col " + c +" is invalid.";
                }
            }
            else{
                this.status = "Error: row " + r +" is invalid.";
            }
        }

    }

    public String check_game(){
        for (int i =0; i < 3; i++){
            if (board[i][0]==board[i][1] && board[i][1] == board[i][2] && board[i][1]!= '_'){
                return "Win";
            }

            else if(board[0][i]==board[1][i] && board[1][i] == board[2][i] && board[1][i]!= '_'){
                return "Win";
            }

            else if (board[0][0]==board[1][1] && board[1][1] == board[2][2] && board[1][1]!= '_'){
                return "Win";
            }

            else if (board[2][1]==board[1][1] && board[1][1] == board[1][2] && board[1][1]!= '_'){
                return "Win";
            }

            else if (this.turns == 9){
                return "Tie";
            }
        }
        return "continue";
    }
}
// {'_', '_', '_'},
// {'_', '_', '_'},
// {'_', '_', '_'}