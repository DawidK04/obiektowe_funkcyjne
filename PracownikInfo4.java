package dziedziczenie;
import java.util.*;
public class PracownikInfo4 {
    public static void main(String[] args) {
        Kierownik k = new Kierownik("AZ", 3000.00, 2024, 11, 14);

        Pracownik[] wol = new Pracownik[4];
        wol[0] = new Pracownik("JK", 3000.00, 2025, 11, 14);
        wol[1] = new Pracownik("JK", 3000.00, 2025, 11, 14);
        wol[2] = new Pracownik("JK", 3000.00, 2025, 11, 14);
        wol[3] = k;
        for (Pracownik p : wol) {
            System.out.println("Nazwa: " + p.getNazwa() + " Pensja: " + p.getPensja() + " Wyrok: " + p.getDzat());
        }


    }
}
