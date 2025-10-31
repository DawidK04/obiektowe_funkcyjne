import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.FileWriter;

public class IOplik {
    public static void main(String[] args) {
        try {
            Path rsciezka = Paths.get("plik.txt");
            Path asciezka = rsciezka.toAbsolutePath();
            System.out.println(rsciezka);
            System.out.println(asciezka);
            Scanner plik = new Scanner(rsciezka);
            while (plik.hasNextLine()) {
                System.out.println(plik.nextLine());
            }
            plik.close();
        }
        catch (IOException e) {
            System.out.println("Plik nie istnieje lub błąd dostępu do pliku");
        }
            try {
                FileWriter zapis = new FileWriter("plik.txt", true);
                zapis.write("\ncos tam");
                zapis.close();
            } catch (IOException e) {
                System.out.println("Plik nie istnieje lub błąd dostępu do pliku");
            }

    }
}
