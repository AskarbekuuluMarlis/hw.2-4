import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> NameA = new ArrayList<>();
        System.out.println("Введите 5 имен: ");
        for (int i = 0; i < 5; i++) {
            NameA.add(scanner.nextLine());
        }

        System.out.println("Список А:");
        for (String s : NameA) {
            System.out.println(s);
        }



        ArrayList<String> NameB = new ArrayList<>();
        System.out.println("Введите 5 имен: ");
        for (int i = 0; i < 5; i++) {
            NameB.add(scanner.nextLine());
        }

        System.out.println("Список B:");
        for (String s : NameB) {
            System.out.println(s);
        }

        ArrayList<String> NameC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            NameC.add(NameA.get(i));
            NameC.add(NameB.get(4 - i));
        }

        System.out.println("Список С:");
        for (String s : NameC) {
            System.out.println(s);
        }

        NameC.sort(Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список С:");
        for (String s : NameC) {
            System.out.println(s);
        }

        scanner.close();



  }
}