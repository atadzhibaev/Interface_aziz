import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        try {
            System.out.println("Loading the sound of a dog barking.");

            // Load the .wav file (Ensure the file path is correct)
            File file = new File("src/barking-large-and-small-dog-290711.wav");
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
            System.out.println("Dog is barking...");

            // Keep the program running until the sound finishes
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Close resources
            clip.close();
            bark.close();
         } catch (Exception e) {
            System.out.println("Error occurred.");
        }
    }
}
