package game;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        
        Random dice = new Random();
        Player player = new Player();
        
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
