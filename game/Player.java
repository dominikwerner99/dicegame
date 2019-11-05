package game;
import java.util.Random;

public abstract class Player {
    
    private Random dice = new Random();
    private String name = "Janusz";

    public Player() {
    }

    public Player(String name) {
        setName(name);
    }

    public void setName(String name) {
        if(name != null && name.matches("^[a-zA-z0-9~.]{3,}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imię!");
        }
    }
    
    public String getName() {
        return name;
    }

    public abstract int guess();
    
}