import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String asnwer = new String();
        System.out.print("Want to hear a dog barking (yes/no) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("yes")) {
            Animal charlie = new Dog();
            charlie.printImage();
            charlie.makeSound();
        }

        System.out.print("Want to hear a cat meowing (yes/no) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("yes")) {
            Animal kuzzi = new Cat();
            kuzzi.printImage();
            kuzzi.makeSound();
        }
    }

}
