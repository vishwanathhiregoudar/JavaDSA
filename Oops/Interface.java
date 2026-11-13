public class Interface {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }

    interface ChessPlayer{
        void moves();
    }

    static class Queen implements ChessPlayer{
        public void moves(){
            System.out.println("up,down,left,right,diagonal");
        }
    }

    static class Rook implements ChessPlayer{
        public void moves(){
            System.out.println("up,down,left,right");
        }
    }
    static class King implements ChessPlayer{
        public void moves(){
            System.out.println("up,down,left,right,diagonal-(by 1 step");
        }
    }
    
}
