package tournament;

public class Player {
    
   int id;     
   int value; 

   public Player(int theId, int theValue) {
      id = theId;
      value = theValue;
   }

   public boolean winnerOf(Player x) {
      if (value <= x.value)
         return true;
      else
         return false;
   }
}