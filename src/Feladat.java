import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Feladat {

    ArrayList<Dolgozok> dolgozokLista = new ArrayList<>();

    public void readFile() throws FileNotFoundException {
        File file = new File("dolgozok.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(":");
            Dolgozok dolgozo = new Dolgozok();

            dolgozo.azonosito = Integer.parseInt(lineArray[0]);
            dolgozo.nev = (lineArray[1]);
            dolgozo.varos = (lineArray[2]);
            dolgozo.hazszam = (lineArray[3]);
            dolgozo.fizetes = Integer.parseInt(lineArray[4]);
            dolgozo.szuletes = (lineArray[5]);

            this.dolgozokLista.add(dolgozo);
            System.out.println(line);
        }
        sc.close();
    }

    public int osszegSzolnokDolgozokFizetese() {
        int osszeg = 0;
        for (Dolgozok dolgozo : dolgozokLista) {
            if (dolgozo.varos.equals("Szolnok")) {
                osszeg = dolgozo.fizetes + osszeg;
            }
        }
        System.out.println();
        System.out.println("Az összes Szolnoki Fizetése: " + osszeg);
        return osszeg;
    }
}
