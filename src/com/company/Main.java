package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        System.out.println("Podaj nazwę pliku");//Nazwa pliku to 1.txt
        Scanner nazwa = new Scanner(System.in);// Powołujemy scanner.
        String x = nazwa.next();// Deklarujemy zmienną x
        nazwa.close();// Zamykamy scanner.
        System.out.println(x);
        int ileznaków = iz(x);//Inicjujemy zmienne dla trzech opcji.
        int biale = b(x);
        int slowa = s(x);
        System.out.println("Znaków białych jest : " + biale);
        System.out.println("Słów w pliku jest : " + slowa);
        System.out.println("Znaków w pliku jest : " + ileznaków);


    }

    public static int s(String x) throws FileNotFoundException {
        //Tworzymy metodę liczącą słowa w pliku
        Scanner slowa = new Scanner(new File(x));
        int k = 0;
        while (slowa.hasNext()) {
            slowa.next();
            k++;
        }
        slowa.close();
        return k;

    }

    public static int b(String x) throws FileNotFoundException {
        Scanner znaki = new Scanner(new File(x)).useDelimiter("[\\s]");
       // \s - \t\n\x0B\f\r - czyli biale znaki
        int l = 0;
        while (znaki.hasNext()){
            znaki.next();
            l++;
        }
        znaki.close();
        return l;

    }

    public static int iz(String x)throws FileNotFoundException {
        Scanner biale = new Scanner(new File(x)).useDelimiter("[^\\s]");
        //\S czyli ^\\s, co oznacza, że w tym przypadku białe znaki nas nie obchodzą

        int k = 0;
        while (biale.hasNext()){
            biale.next();
            k++;

        }
        biale.close();
        return k;
    }


}


