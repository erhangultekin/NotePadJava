package proje1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Kelime {

    private String kelime;
    private int uzunluk;
    private ArrayList<Character> CharArrayList;
    
   

    public Kelime(String kelime) {
        CharArrayList=new ArrayList<>();
        this.kelime = kelime;
        this.uzunluk = kelime.length();
        for(int k=0;k<this.uzunluk;k++){
          CharArrayList.add(kelime.charAt(k));
        }
        Collections.sort(CharArrayList);
       
    }

    public String getKelime() {
        return kelime;
    }

    public ArrayList<Character> getCharArrayList() {
        return CharArrayList;
    }

    public void setKelime(String kelime) {
        this.kelime = kelime;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public String toString() {
        return "Kelime= " + kelime + " Uzunluk=" + uzunluk;
    }

    public boolean equals(Kelime kelime2) {
        if (!this.kelime.equalsIgnoreCase(kelime2.getKelime())) {
            return false;
        }
        return true;
    }

    public int singleTransposition(Kelime kelime2) {
        StringBuilder copy = new StringBuilder(this.getKelime()); //Scanner.singleTra(txt)
        int kontrol=0;
        for (int i = 0; i < this.getUzunluk() - 1; i++) {
            char a = this.getKelime().charAt(i);
            char b = this.getKelime().charAt(i + 1);
            copy.setCharAt(i, b);
            copy.setCharAt(i + 1, a);
            if (copy.toString().equals(kelime2.getKelime())) {
                this.setKelime(copy.toString());
                System.out.println("Kelime değişti: " + this.getKelime());
                kontrol=1;
                break;
            } else {
                copy = new StringBuilder(this.getKelime());
                System.out.println("Değiştirilemedi: " + this.getKelime());
            }

        }
        return kontrol;
    }

}
