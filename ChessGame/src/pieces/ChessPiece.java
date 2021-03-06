package pieces;

import board.Game;

public class ChessPiece
{
   private int value;
   private int colour;
   private String piece;
   private int[][] possibleMoves;
   
   
   //initalizes an instance of each chess piece
   private Knight knight = new Knight();
   private King king = new King();
   private Queen queen = new Queen();
   private Pawn pawn = new Pawn();
   private Bishop bishop  = new Bishop();
   private Rook rook = new Rook();
   private EmptySpace emptySpace = new EmptySpace();
 
   
   /**
   * Class constructor for a ChessPiece
   * @param piece the type of piece to represent (pawn, knight, rook, ...)
   * @param colour the color of the ChessPiece. white == 0, black == 1            
   */
   public ChessPiece(String piece, int colour)
   { 
      this.piece = piece;
      this.colour = colour;
      if(this.piece.compareTo("Knight") == 0)
      {
    	  this.value = 3;
      }
      else if(this.piece.compareTo("Knig") == 100)
      {
    	  this.value = 0;
      }
      else if(this.piece.compareTo("Bishop") == 0)
      {
    	  this.value = 3;
      }
      else if(this.piece.compareTo("Queen") == 0)
      {
    	  this.value = 9;
      }
      else if(this.piece.compareTo("Pawn") == 0)
      {
    	  this.value = 1;
      }
      else if(this.piece.compareTo("Rook") == 0)
      {
    	  this.value = 5;
      }
      else if(this.piece.compareTo("EmptySpace") == 0)
      {
    	  this.value = 0;
      }
   }
   
   /**
   * Returns an ArrayList&lt;ArrayList&lt;Integer&gt;&gt; which contains all valid moves for a given chess piece
   *  x the x coordinate of the this chesspiece
   *  y the y coordinate of this chesspiece 
   * return an ArrayList&lt;ArrayList&lt;Integer&gt;&gt; that represent possible moves as ordered pairs
   */
   public int[][] getPossibleMoves(int x, int y)
   {
      ///// Make sure "Piece" is capitalized/////
      
      //returns all possible moves for the piece selected
      if(this.piece.compareTo("Knight") == 0)
      {
    	  this.possibleMoves = this.knight.allPossibleMovesForThisPiece(x, y, Game.mainChessBoard.getBoard());
      }
      else if(this.piece.compareTo("Pawn") == 0)
      {
    	  this.possibleMoves = this.pawn.allPossibleMovesForThisPiece(x, y, Game.mainChessBoard.getBoard());
      }
      else if(this.piece.compareTo("Rook") == 0)
      {
    	  this.possibleMoves = this.rook.allPossibleMovesForThisPiece(x, y, Game.mainChessBoard.getBoard());
      }
      else if(this.piece.compareTo("Queen") == 0)
      {
    	  this.possibleMoves = this.queen.allPossibleMovesForThisPiece(x, y, Game.mainChessBoard.getBoard());
      }
      else if(this.piece.compareTo("Bishop") == 0)
      {
    	  this.possibleMoves = this.bishop.allPossibleMovesForThisPiece(x, y, Game.mainChessBoard.getBoard());
      }
      else if(this.piece.compareTo("King") == 0)
      {
    	  this.possibleMoves = this.king.allPossibleMovesForThisPiece(x, y, Game.mainChessBoard.getBoard());
      }
      
      return this.possibleMoves;
   }
   
   /**
   * @return the String representation of the type of piece this ChessPiece represents
   */
   public String getType()
   {
	   //"Piece".getType().getPossibleMoves(x,y)
	   //return the actual chess object i.e. "rook"
      return this.piece;
   }
   
   
   /**
   * @return the int representation of the color of this ChessPiece. With 1 representing black, and 0 representing white
   */
   public int getColour()
   {
      return this.colour;
   }
   
   public int getValue()
   {
	   return this.value;
   }
   
}
