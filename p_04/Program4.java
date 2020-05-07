import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program4 {
    public static void main(String[] args) {

        try {
            File f = new File(args[0]); // Creation of File Descriptor for input file

            // Creates Two CubbyHoles for the Banana/Carrorot Consumers
            CubbyHole vowelsCub_1 = new CubbyHole();
            CubbyHole consonantCub_2 = new CubbyHole();

            // Creates Producer
            Producer apple = new Producer(vowelsCub_1, consonantCub_2, f);

            // Vowels Consumer
            Consumer banana = new Consumer(vowelsCub_1);
            // Consonants Consumer
            Consumer carrot = new Consumer(consonantCub_2);

            apple.start();
            banana.start();
            carrot.start();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class CubbyHole {
    private char contents;
    private boolean available = false;

    public synchronized char get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(char value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}

class Consumer extends Thread {
    private CubbyHole cubbyhole;
    private char character;

    public Consumer(CubbyHole c) {
        cubbyhole = c;
    }

    public void run() {
        do {
            character = cubbyhole.get();
            System.out.println("Consumer #" + this.cubbyhole + " got: " + character);
        } while (character != '.');
    }
}

class Producer extends Thread {
    // Cubbyholes to hold vowels
    private CubbyHole bananaCub_1;

    // Cubbyholes to hold consonants
    private CubbyHole carrotCub_2;
    private File filetoRead;

    public Producer(CubbyHole c1, CubbyHole c2, File f) {
        // Vowels
        bananaCub_1 = c1;
        // Consonants
        carrotCub_2 = c2;
        filetoRead = f;

    }

    public void run() {
        try {
            FileReader fr = new FileReader(filetoRead); // Creation of File Reader object
            BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
            int c = 0;
            while ((c = br.read()) != -1) // Read char by Char
            {
                char character = (char) c;
                switch (character) {
                    case 'a':
                        // Call Cub_1.put()
                        bananaCub_1.put('a');
                        System.out.println('a');
                        break;
                    case 'e':
                        // Call Cub_1.put()
                        bananaCub_1.put('e');
                        System.out.println('e');
                        break;
                    case 'i':
                        // Call Cub_1.put()
                        bananaCub_1.put('i');
                        System.out.println('i');
                        break;
                    case 'o':
                        // Call Cub_1.put()
                        bananaCub_1.put('o');
                        System.out.println('o');
                        break;
                    case 'u':
                        // Call Cub_1.put()
                        bananaCub_1.put('u');
                        System.out.println('u');
                        break;
                    default:
                        // Call Cub_2.put()
                        carrotCub_2.put(character);
                        System.out.println("Other Letter");
                        ;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // File Done! Sends . to both consumers:

    }
}
