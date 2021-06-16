package tabuleiro;

public class Piece {

   protected Position position;
   private Tabuleiro tab;
   
   public Piece(Tabuleiro tab) {
	   this.tab = tab;
	   position= null;
   }
}
