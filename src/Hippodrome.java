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

        Hippodrome.game.run();
    }


    public List<Horse> getHorses() { return horses; }


    public void run()
    {
        for (int iterator = 0; iterator < 100; iterator++)
        {
            move();
            print();

            try
            {
                Thread.sleep(200);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }


    public void move()
    {
        for(Horse currentHorse : horses)
        {
            currentHorse.move();
        }
    }


    public void print()
    {
        for(Horse currentHorse : horses)
        {
            currentHorse.print();
        }

        for (int iterator = 0; iterator < 10; iterator++)
        {
            System.out.println();
        }
    }
}
