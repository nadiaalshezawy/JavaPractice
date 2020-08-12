public class main {

    public static void main(String args[])
    {
        Game chess= new Game();
        Position p1=new Position(1,2);
        Position p2=new Position(5,5);
        Position p3=new Position(3,5);
        Position p4=new Position(3,2);
        Queen q1=new Queen();
       // q1.;
       // (q1.position).row=1;
      //  (q1.position).column=5;
        chess.board[1][2]=q1;


       if( q1.isValidMove(p1))

           System.out.println(" possible move");
       else
           System.out.println(" not right move");

        if( q1.isValidMove(p2))

            System.out.println(" possible move");
        else
            System.out.println(" not right move");

        if( q1.isValidMove(p3))

            System.out.println(" possible move");
        else
            System.out.println(" not right move");

        if( q1.isValidMove(p4))

            System.out.println(" possible move");
        else
            System.out.println(" not right move");


     //   q1.position=(chess.board[1][2]).position;

    }
}
