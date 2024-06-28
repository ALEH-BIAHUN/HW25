import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Man> manSupplier = () -> {
            System.out.println("Enter your name");
            String name = new Scanner(System.in).nextLine();

            System.out.println("Enter your age");
            int age = new Scanner(System.in).nextInt();

            System.out.println("Enter your height");
            int height = (new Scanner(System.in).nextInt());

            return new Man(name, age, height);
        };
        Man man = manSupplier.get();
        Man woman = manSupplier.get();

        System.out.println(man);
        System.out.println(woman);

        Predicate<Integer> isAdult = (age) -> age >= 18;

        System.out.println(man.getName() + " - " + (isAdult.test(man.getAge()) ? "is a legal adult" : "is not a legal adult"));
        System.out.println(woman.getName() + " - " + (isAdult.test(woman.getAge()) ? "is a legal adult" : "is not a legal adult"));
    }
}