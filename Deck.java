/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orangehouse.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 *
 * @author oscar
 */
public class Deck {
    
    private List<Card> deck; // Almacenar todas las cartas
    private List<Card> mano; // Almacenar las cartas repartidas
  

    public Deck() {
        deck = new ArrayList<>();
        mano = new ArrayList<>();
        inicializarDeck();
    }

    private void inicializarDeck() {
        String[] palos = {"Treboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo", "Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < palos.length; i++) {
            for (String valor : valores) {
                deck.add(new Card(palos[i], colores[i], valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("Se mezclo el Deck.");
    }

    public void head() {
        if (!deck.isEmpty()) {
            Card carta = deck.remove(0);
            System.out.println(carta);
            System.out.println("Quedan " + deck.size() + " cartas en el deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void pick() {
        if (!deck.isEmpty()) {
            Random random = new Random();
            int indice = random.nextInt(deck.size());
            Card carta = deck.remove(indice);
            System.out.println(carta);
            System.out.println("Quedan " + deck.size() + " cartas en el deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void hand() {
        if (deck.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                mano.add(deck.remove(0));
            }

            for (Card carta : mano) {
                System.out.println(carta);
            }
            System.out.println("Quedan " + deck.size() + " cartas en el deck.");
            mano.clear(); // Limpiamos la mano después de repartir
        } else {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
        }
    }

   
}
