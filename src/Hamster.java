import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

//Running Tests again again
public class Hamster implements Animal {

    @Override
    public void makeSound(){
        try{
            System.out.println("Loading the sound of Hamster noise");

            // Load a non-existent file for the time being
            File file = new File("src/sounds/hamster-33794.wav");
            if (!file.exists()){
                System.out.println("Error: Sound file not found!");
                return;
            }

            AudioInputStream squeak = AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(squeak);

            clip.start();
            System.out.println("Hamster is squeaking...");

            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close();
            squeak.close();
        } catch (Exception e){
            System.out.println("Error occurred.");
        }
    }

    @Override
    public void printImage() {
        System.out.println("\n" +
                "             .     .\n" +
                "            (>\\---/<)\n" +
                "            ,'     `.\n" +
                "           /  q   p  \\\n" +
                "          (  >(_Y_)<  )\n" +
                "           >-' `-' `-<-.\n" +
                "          /  _.== ,=.,- \\\n" +
                "         /,    )`  '(    )\n" +
                "        ; `._.'      `--<\n" +
                "       :     \\        |  )\n" +
                "       \\      )       ;_/  \n" +
                "        `._ _/_  ___.'-\\\\\\\n" +
                "           `--\\\\\\\n" +
                "\n" +
                "\n" +
                "\n");
    }

    @Override
    public void makeMove() {
        System.out.println("The hamster does a back-flip!");
    }

    @Override
    public void eat() {
        System.out.println("The hamster nibbles on some food.");
    }
}
