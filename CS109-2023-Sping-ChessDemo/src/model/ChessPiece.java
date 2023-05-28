package model;


public class ChessPiece {
    // the owner of the chess
    private PlayerColor owner;

    // Elephant? Cat? Dog? ...
    private String name;
    private int rank;

    public ChessPiece(PlayerColor owner, String name, int rank) {
        this.owner = owner;
        this.name = name;
        this.rank = rank;
    }

    public boolean canCapture(ChessPiece target) {
        // TODO: Finish this method!
        if(this.owner == target.owner){
            return false;
        }
        if(this.name.equals("Rat") && target.name.equals("Elephant")){
            return true;
        }
        if(this.name.equals("Elephant") && target.name.equals("Rat")){
            return false;
        }
        if(this.rank < target.rank){
            return false;
        }
            return true;
    }

    public String getName() {
        return name;
    }

    public PlayerColor getOwner() {
        return owner;
    }
}
