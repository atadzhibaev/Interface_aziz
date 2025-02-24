import java.util.Scanner;

public class AnimalDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String asnwer = new String();
        System.out.print("Want to hear a dog barking (y/n) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("y")) {
            Animal charlie = new Dog();
            charlie.printImage();
            charlie.makeSound();
            charlie.makeMove();
            charlie.eat();
        }

        System.out.print("Want to hear a cat meowing (y/n) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("y")) {
            Animal kuzzi = new Cat();
            kuzzi.printImage();
            kuzzi.makeSound();
            kuzzi.makeMove();
            kuzzi.eat();
        }

        System.out.print("Want to hear a chicken cluck (y/n) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("y")) {
            Animal chicken = new Chicken();
            chicken.printImage();
            chicken.makeSound();
            chicken.makeMove();
            chicken.eat();
        }

        }
    }
}