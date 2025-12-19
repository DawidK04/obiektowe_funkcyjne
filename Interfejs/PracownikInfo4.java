import java.util.*;
public class PracownikInfo4 {
    public static void main(String[] args) {

        Pracownik[] wol = new Pracownik[3];
        wol[0] = new Pracownik("Jan", 1999.99, 2000, 1, 1);
        wol[1] = new Pracownik("Ali", 2000.01, 2000, 1, 1);
        wol[2] = new Pracownik("Ozy", 2000, 2000, 1, 1);
        for (Pracownik p : wol) {
            System.out.println("Nazwa: " + p.getNazwa() + ", Pensja: " + p.getPensja() + ", Dzat: " + p.getDzat());
        }
        wol[0].premia(10);
        wol[1].premia(10);
        wol[2].premia(10);
        System.out.println();
        for (Pracownik p : wol) {
            System.out.println("Nazwa: " + p.getNazwa() + ", Pensja: " + p.getPensja() + ", Dzat: " + p.getDzat());
        }
        System.out.println();
        Arrays.sort(wol);
        for (Pracownik p : wol) {
            System.out.println("Nazwa: " + p.getNazwa() + ", Pensja: " + p.getPensja() + ", Dzat: " + p.getDzat());
        }
    }
}
