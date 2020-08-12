class Bishop extends Piece{

    Bishop()
    {
        (this.position).row=0;
        (this.position).column=0;
    }


    boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.column - (this.position).column) == Math.abs(newPosition.row - (this.position).row)){
            return true;
        }
        else{
            return false;
        }
    }
}