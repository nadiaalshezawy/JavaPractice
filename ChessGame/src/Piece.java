class Piece {
    Position position;
 Piece()
 {
     position =new Position(0,0);
 }

    Piece(int r, int c )
    {
        position =new Position(r,c);
    }

    boolean isValidMove(Position newPosition){

        if(position.row>0 && position.column>0
                && position.row<8 && position.column<8){
              return true;

        }
        else{
            return false;
        }
    }

}