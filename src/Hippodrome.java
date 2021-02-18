import java.util.*;


public class Hippodrome
{
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List horses)
    {
        this.horses = horses;
    }


    public static void main(String[] args)
    {
        List<Horse> horses = new ArrayList<>();

        horses.add(new Horse("Плотва 1", 3.0, 0.0));
        horses.add(new Horse("Плотва 2", 3.0, 0.0));
        horses.add(new Horse("Плотва 3", 3.0, 0.0));

        Hippodrome.game = new Hippodrome(horses);
    }


    public List<Horse> getHorses() { return horses; }
}
