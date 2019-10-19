package dice;
import java.util.Random;

public class Dice {
    
    public static void main(String[] args) {
        
        Random dice = new Random();
        Player player = new Player();
        player.setName(null); // jeśli nie___________, to można nadal wstawić null jako parametr
        //player.dice = null; // PUSTA REFERENCJA, dice - public -> program się wywala (null - brak obiektu, pustka nie ma metody nextInt)
        
        int number;
        int guess;
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowano: " + number);
            
            guess = player.guess();
            System.out.println(player.getName() + " odgaduje: " + guess);
        }
        while(number != guess);
        
        System.out.println("Brawo!");
    }
    
}
// klasa jest definicją typu (obiektowego)
// większość typów w Javie to typy obiektowe (np. Random)
// traktować klasę jako TYP (obiektowy)
// System.out.println() [Klasa.typ.funkcja()]
// PLIK Game i PLIK Player są w PAKIECIE game

// KLASY to pliki
// PAKIETY to katalogi

// REFAKTORYZACJA -  

// klasy zawsze tworzyć jako nowy plik