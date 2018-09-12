package tournament;

import java.util.Scanner;

public class WinnerTournamentTree {

    int lowExt;           
    int offset;
    
    int[] tree;          
    Player[] players;   


    public int getWinner() {
        return (tree == null) ? 0 : tree[1];
    }

    public void initialize(Player[] players) {
       int n = players.length - 1;
       if (n < 2)
          throw new IllegalArgumentException
                    ("must have at least 2 players");

       this.players = players;
       tree = new int [n];

       int i, s;
       for (s = 1; 2 * s <= n - 1; s += s);

       lowExt = 2 * (n - s);
       offset = 2 * s - 1;

       for (i = 2; i <= lowExt; i += 2)
          play((offset + i) / 2, i - 1, i);

       if (n % 2 == 1) {
          play(n/2, tree[n - 1], lowExt + 1);
          i = lowExt + 3;
       }
       else i = lowExt + 2;

       for (; i <= n; i += 2)
          play((i - lowExt + n - 1) / 2, i - 1, i);
    }

    void play(int p, int leftChild, int rightChild) {
        
       tree[p] = players[leftChild].winnerOf(players[rightChild]) ?
                       leftChild : rightChild;

       while (p % 2 == 1 && p > 1) {
          tree[p / 2] = players[tree[p - 1]].winnerOf(players[tree[p]]) ?
                           tree[p - 1] : tree[p];
          p /= 2;
       }
    }

    public static void main(String [] args) {

       Scanner input = new Scanner(System.in);

       System.out.println("Enter the number of players");
       int n = input.nextInt();
       if (n < 2)
          throw new CustomInputException
                    ("must have at least 2 players");

       Player[] thePlayer = new Player [n + 1];

       System.out.println("Enter player values");
       for (int i = 1; i <= n; i++)
          thePlayer[i] = new Player(i, input.nextInt());

       WinnerTournamentTree w = new WinnerTournamentTree();
       w.initialize(thePlayer);

       System.out.println("The winner is: ");
       System.out.println(w.players[w.getWinner()].value);
       
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.println(w.players[w.getWinner()].value);
            w.players[w.getWinner()] = new Player(w.getWinner(), 2147483647);
            w.initialize(w.players);
        }

    }
}