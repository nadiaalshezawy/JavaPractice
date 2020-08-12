 class Queen  extends Piece {



    Queen()
    {
        position.row=1;
        position.column=5;
        //( super.position).row=r;
        //( super.position).column=c;
        //(this.position).row=r;
       // (this.position).column=c;
   }
     boolean isValidMove(Position newPosition) {

         if (super.isValidMove(newPosition))
             if ((Math.abs(newPosition.column - (this.position).column) == Math.abs(newPosition.row - (this.position).row)) ||
                     (newPosition.column == (this.position).column || newPosition.row == (this.position).row)) {
                 return true;
             } else {
                 return false;
             }
        return false;
     }
 }

/*
    Queen queen = new Queen();
    Position testPosition = new Position(3,10);
if(queen.isValidMove(testPosition)){
        System.out.println("Yes, I can move there.");
    }
else{
        System.out.println("Nope, can't do!");
    }
    */

