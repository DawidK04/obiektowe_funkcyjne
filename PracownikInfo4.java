import java.util.*;
public class PracownikInfo4 {
    public static void main(String[] args) {

        Osoba[] wol = new Osoba[3];
        wol[0] = new Pracownik("JK", 3000.00, 2025, 11, 14);
        wol[1] = new Pracownik("JK", 3000.00, 2025, 11, 14);
        wol[2] = new Student("XY", "Biochem");
        for (Osoba p : wol) {
            System.out.println("Nazwa: " + p.getNazwa() + ", " + p.getInfo());
        }
    }
}
