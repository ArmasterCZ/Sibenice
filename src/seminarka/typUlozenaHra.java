/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seminarka;

/**
 *
 * @author Armaster
 */
public class typUlozenaHra {

    String hadaneSlovo = "";                                                    // hádané Slovo
    String napoveda = "";                                                       // nápověda
    boolean nastNapoveda = false;                                              // zobrazena napovedy
    int pocetZivotu = 1;                                                        // počet životů
    int pocetUhadnuti = 1;                                                      // počet uhodnutí
    String zadanaPismena = "";                                                  // jiz dríve zadane pismena
    int obrazek = 9;                                                           // zobrazeny obrázek
    String pi1 = "";                                                            // písmena
    String pi2 = "";
    String pi3 = "";
    String pi4 = "";
    String pi5 = "";
    String pi6 = "";
    String pi7 = "";
    String pi8 = "";
    String pi9 = "";
    String pi10 = "";
    String pi11 = "";
    String pi12 = "";

    public typUlozenaHra(String hadaneSlovo, String napoveda, boolean nastNapoveda, int pocetZivotu, int pocetUhadnuti, String zadanaPismena, int obrazek, String pi1, String pi2, String pi3, String pi4, String pi5, String pi6, String pi7, String pi8, String pi9, String pi10, String pi11, String pi12) {
        this.hadaneSlovo = hadaneSlovo;
        this.napoveda = napoveda;
        this.nastNapoveda = nastNapoveda;
        this.pocetZivotu = pocetZivotu;
        this.pocetUhadnuti = pocetUhadnuti;
        this.zadanaPismena = zadanaPismena;
        this.obrazek = obrazek;
        this.pi1 = pi1;
        this.pi2 = pi2;
        this.pi3 = pi3;
        this.pi4 = pi4;
        this.pi5 = pi5;
        this.pi6 = pi6;
        this.pi7 = pi7;
        this.pi8 = pi8;
        this.pi9 = pi9;
        this.pi10 = pi10;
        this.pi11 = pi11;
        this.pi12 = pi12;
    }

    public String getHadaneSlovo() {
        return hadaneSlovo;
    }

    public String getNapoveda() {
        return napoveda;
    }

    public boolean getNastNapoveda() {
        return nastNapoveda;
    }

    public int getPocetZivotu() {
        return pocetZivotu;
    }

    public int getPocetUhadnuti() {
        return pocetUhadnuti;
    }

    public String getZadanaPismena() {
        return zadanaPismena;
    }

    public int getObrazek() {
        return obrazek;
    }

    public String getPi1() {
        return pi1;
    }

    public String getPi2() {
        return pi2;
    }

    public String getPi3() {
        return pi3;
    }

    public String getPi4() {
        return pi4;
    }

    public String getPi5() {
        return pi5;
    }

    public String getPi6() {
        return pi6;
    }

    public String getPi7() {
        return pi7;
    }

    public String getPi8() {
        return pi8;
    }

    public String getPi9() {
        return pi9;
    }

    public String getPi10() {
        return pi10;
    }

    public String getPi11() {
        return pi11;
    }

    public String getPi12() {
        return pi12;
    }
    

}
