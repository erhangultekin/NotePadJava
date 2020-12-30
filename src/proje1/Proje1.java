package proje1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Proje1 {
   
    public static void main(String[] args) {

        ArrayList<Kelime> kelimeKontrol = new ArrayList<Kelime>();
        ArrayList<Kelime> scannerKontrol = new ArrayList<Kelime>();
        String[] geciciListe;

        try {
            FileReader fr = new FileReader("words.txt");
            BufferedReader br = new BufferedReader(fr);
            Scanner scanner = new Scanner(br);

            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                kelimeKontrol.add(new Kelime(satir));

            }
        } catch (Exception FileNotFoundException) {
            System.err.println("DOSYA BULUNAMADI.");
        }

      

    }
    
    
}
