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
        Hippodrome.game.printWinner();
    }


    public void run()
    {
        for (int iterator = 0; iterator < 100; iterator++)
        {
            move();
            print();

            try
            {
                Thread.sleep(350);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }


    private void move()
    {
        for(Horse currentHorse : horses)
        {
            currentHorse.move();
        }
    }


    private void print()
    {
        for(Horse currentHorse : horses)
        {
            currentHorse.print();
        }

        System.out.printf(String.format("%5s", "").replace(' ', '\n'));
    }


    private Horse getWinner()
    {
        double maxDistance = 0;
        Horse winner = null;

        for(Horse currentHorse : horses)
        {
            if (maxDistance < currentHorse.getDistance())
            {
                maxDistance = currentHorse.getDistance();
                winner = currentHorse;
            }
        }

        return winner;
    }


    public void printWinner()
    {
        System.out.printf("Winner is %s!", getWinner().getName());
    }
}
