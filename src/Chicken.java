import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Chicken implements Animal{

    @Override
    public void makeSound() {
        try {
            System.out.println("Loading the sound of a chicken.");

            // Load the .wav file (Ensure the file path is correct)
            File file = new File("src/sounds/chicken-cluking.wav");
            if (!file.exists()) {
                System.out.println("Error: Sound file not found!");
                return;
            }

            // Open audio input stream
            AudioInputStream bark = AudioSystem.getAudioInputStream(file);

            // Get a Clip object and open it with the audio stream
            Clip clip = AudioSystem.getClip();
            clip.open(bark);

            // Play the sound
            clip.start();
            System.out.println("Chicken clucking...");

            // Keep the program running until the sound finishes
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Close resources
            clip.close();
            bark.close();
        } catch (Exception e) {
            System.out.println("Error occurred.");
        }
    }

    @Override
    public void printImage() {
        System.out.println("");
        System.out.println("⠀⢀⢬⡷⠛⡂");
        System.out.println("⠀⡎⡳⣐⠊⢥⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠰⢻⠀⠩⠗⡄⠙⢆⠀⠀⠀⠀⠀⢀⡴⠚⠉⠀⠀⠀⠈⠑⠢⡀⠀⠀");
        System.out.println("⠀⠰⣄⡘⠚⢀⠀⢸⠀⠀⠀⠀⢠⠏⠀⠀⠀⣀⠔⠒⠀⠒⢤⡈⢆⠀");
        System.out.println("⢠⠊⠀⠀⠀⠀⡆⢸⠀⠀⠀⠀⡼⠀⠀⠀⠜⢋⡉⠀⢉⠢⡀⠹⡜⡄");
        System.out.println("⡎⠀⠀⠀⠀⢠⠃⠘⣆⠀⠀⠀⡇⠀⠀⠀⠀⢉⣀⣉⡠⡙⢎⡆⢣⡇");
        System.out.println("⡁⠀⠀⠀⡔⠁⠀⠀⠈⠉⠑⠒⠒⠤⡀⢀⡀⢬⢅⢂⠉⢧⠈⡷⢸⠃");
        System.out.println("⡇⠀⠀⡌⡄⠀⠀⠀⠀⠀⠈⠄⠀⠀⠐⡄⠫⠫⡆⢻⠀⠈⠀⠁⠈⠀");
        System.out.println("⠹⣄⠀⠀⢱⠀⠀⠀⠀⠀⠀⠈⠢⡀⠀⢸⢻⠀⠇⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠈⠳⣄⢄⠳⡀⠀⠀⠀⠀⠀⠀⠈⠲⣤⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠈⢇⠑⢎⠑⠒⠄⠤⠤⠤⡤⠒⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠈⡆⠈⣆⠀⢸⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠘⡆⠘⢒⠚⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⢀⣠⣤⣤⢇⠆⢸⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠈⠀⠠⠒⠛⢻⡧⠎⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }

    @Override
    public void makeMove() {
        System.out.println("Chicken laid an egg!");
    }

    @Override
    public void eat() {
        System.out.println("The chicken is eating.");
    }
}
