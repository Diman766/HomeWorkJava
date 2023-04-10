import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Toy> toys = new ArrayList<>();
    public static List<Toy> winToys = new ArrayList<>();

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int flag = 0;
        while (flag != 4) {
            System.out
                    .print("Выберите действие !\n1 - Внести игрушки в список для розыгрыша\n2 - Перейти к розыгрышу\n3 - Выдать игрушку\n4 - Выход\n");
            flag = console.nextInt();
            if (flag == 1) {
                View.addToy(toys);
                for (Toy i : toys) {
                    System.out.print(i.getInfo() + "\n");
                }

            } else if (flag == 2) {
                if (toys.size() != 0) {
                    Toy win = Program.raffle(toys);
                    System.out.print("Выпала игрушка    " + win.getInfo() + "\n");
                    winToys.add(win);
                } else {
                    System.out.print("Нет игрушек для розыгрыша !\n");
                }

            } else if (flag == 3) {
                if (winToys.size() != 0) {
                    for (Toy i : winToys) {
                        System.out.print(i.getInfo() + "\n");
                    }
                    System.out.print("Введите id игрушки для выдачи\n");
                    int id = console.nextInt();
                    for (int i = 0; i < winToys.size(); i++) {
                        if (winToys.get(i).getId() == id) {
                            Logger.writer(winToys.get(i));
                            winToys.remove(i);
                        }
                    }
                } else {
                    System.out.print("Нет игрушек для выдачи !\n");
                }
            }
        }
        console.close();
    }
}
