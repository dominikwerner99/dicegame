package game;
import java.util.Scanner;

public class PlayerHuman extends Player {
    
    private Scanner in = new Scanner(System.in);
    
    public PlayerHuman() {
    }
    
    public PlayerHuman(String name) {
        super(name);
    }
    
    @Override
    public int guess() {
        return in.nextInt();
    }
    
}
