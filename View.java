import java.util.List;
import java.util.Scanner;

public class View {

    public static List<Toy> addToy(List<Toy> toy) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите название игрушки  ");
        String name = console.nextLine();
        System.out.print("Введите количество  ");
        int quantity = console.nextInt();
        System.out.print("Введите вес  ");
        int weight = console.nextInt();
        int id = toy.size();

        for (int index = 0; index < quantity; index++) {
            toy.add(new Toy(id, name, weight));
            id++;
        }
        return toy;
    }
    
}
