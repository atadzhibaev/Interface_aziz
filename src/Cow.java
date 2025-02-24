import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Cow implements Animal{
    @Override
    public void makeSound() {
        try {
            System.out.println("Loading the sound of a cow.");

            // Load the .wav file (Ensure the file path is correct)
            File file = new File("src/sounds/cow-mooing.wav");
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
            System.out.println("Cow mooing...");

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
        System.out.println("""
                                                       /;    ;\\
                                                   __  \\\\____//
                                                  /{_\\_/   `'\\____
                                                  \\___   (o)  (o  }
                       _____________________________/          :--' \s
                   ,-,'`@@@@@@@@       @@@@@@         \\_    `__\\
                  ;:(  @@@@@@@@@        @@@             \\___(o'o)
                  :: )  @@@@          @@@@@@        ,'@@(  `===='      \s
                  :: : @@@@@:          @@@@         `@@@:
                  :: \\  @@@@@:       @@@@@@@)    (  '@@@'
                  ;; /\\      /`,    @@@@@@@@@\\   :@@@@@)
                  ::/  )    {_----------------:  :~`,~~;
                 ;;'`; :   )                  :  / `; ;
                ;;;; : :   ;                  :  ;  ; :             \s
                `'`' / :  :                   :  :  : :
                    )_ \\__;      ";"          :_ ;  \\_\\       `,','
                    :__\\  \\    * `,'*         \\  \\  :  \\   *  8`;'*  *
                        `^'     \\ :/           `^'  `-^-'   \\v/ :  \\/\s                                
                """);
    }

    @Override
    public void makeMove() {
        System.out.println("The cow is trotting!");
    }

    @Override
    public void eat() {

        System.out.println("The cow is eating some grass on the other side of the fence!");
    }
}
