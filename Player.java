package game;
import java.util.Random;

public abstract class Player {
    
    private Random dice = new Random();
    private String name = "Anonim";

    public Player() {
    }

    public Player(String name) {
        setName(name);
    }

    public void setName(String name) {

        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Nieprawidłowe imię");
        }
    }
    
    public String getName() {
        return name;
    }

    public abstract int guess();
    
}