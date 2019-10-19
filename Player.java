package dice;
import java.util.Random;

public class Player {
    private Random dice = new Random(); // POLE klasy - jest tworzony na początku i usuwany, gdy nie ma już referencji
                                        // pamięcią zarządza GARBAGE COLLECTOR
    private String name;
    
    public void setName(String name) {  // nazwa parametru powinna być identyczna z nazwą pola
        
        if(name != null) {
            this.name = name;   // "this" przyjmuje wartość obiektu, na którym jest wywoływana metoda
        } else {
            System.out.println("nie może być null");
        }
        
    }
    
    public String getName() {
        return name;
    }
    
    public int guess() {
        return dice.nextInt(6) + 1;
    }
}