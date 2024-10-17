/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rileydavey
 */
public class Wheel {

    private final Random random;

    public Wheel()
    {
        this.random = new Random();
    }

    public ArrayList board()  
    {
        ArrayList board = new ArrayList();
        try
        {
        FileReader fr = new FileReader("resources/RouletteColours.txt");
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = null;
                int i = 0;
                while((line = br.readLine())!=null)
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