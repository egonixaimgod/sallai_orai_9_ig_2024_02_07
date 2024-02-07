public class App {
    public static void main(String[] args) throws Exception {
        Feladat feladat = new Feladat();
        feladat.readFile();
        feladat.osszegSzolnokDolgozokFizetese();
    }
}
