/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package orangehouse.main;

/**
 *
 * @author oscar
 */
public class Main {

   public static void main(String[] args) {
        Deck miDeck = new Deck();
        miDeck.shuffle();
        miDeck.head();
        miDeck.pick();
        miDeck.hand();

    }
}

