import java.util.Date;
import java.util.GregorianCalendar;

public class Pracownik extends Osoba{
    // pole(a)
    // private String nazwa;
    private double pensja;
    private Date dzat; // data zatrudnienia

    // konstruktor
    public Pracownik(String n, double p, int r, int m, int d) {
        // nazwa = n;
        super (n);
        pensja = p;
        GregorianCalendar rmd = new GregorianCalendar(r, m - 1, d);
        dzat = rmd.getTime();
    }

    // public String getNazwa() {return nazwa;}
    public double getPensja() {
        return pensja;
    }
    public Date getDzat() {
        return dzat;
    }

    public void premia(double procent){double p = pensja * procent / 100;
    pensja += p;}

    public String getInfo() {return String.format("Wypłata: %.2f zł", pensja);}
}
