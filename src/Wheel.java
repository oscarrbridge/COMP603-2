
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Wheel{

    private final Random random;
    int betMultiplier;

    public Wheel()
    {
        this.random = new Random();
        this.betMultiplier = betMultiplier;
    }

    public ArrayList board()  
    {
        ArrayList board = new ArrayList();
        try
        {
        FileReader fr = new FileReader("resources/RouletteColours.txt");
            try (BufferedReader br = new BufferedReader(fr)) {
                String line;
                int i = 0;
                while((line = br.readLine())!= null)
                {
                    board.add(i,line);
                    i++;
                }   
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File is not found");
        }
        catch(IOException e)
        {
            System.out.println("Error reading from file");
        }
        return board;
    }

    public int Spin()
    {
        return random.nextInt(37);
    }

}