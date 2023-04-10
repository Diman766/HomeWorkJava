import java.util.List;

public class Program {
    
    public static int getRandomIntegerBetweenRange(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static Toy raffle(List<Toy> toys) {
        int completeWeight = 0;
        for (Toy i : toys) {
            completeWeight += i.getWeight();
        }
        int r = Program.getRandomIntegerBetweenRange(0, completeWeight - 1);
        for (int j = 0; j < toys.size(); j++) {
            if (r <= toys.get(j).getWeight()) {
                Toy winner = toys.get(j);
                toys.remove(j);
                return winner;
            } else {
                r -= toys.get(j).getWeight();
            }
        }
        return null;
    }
}
