/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seminarka;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Armaster
 */
public class loadUlozenaHra {

    public static typUlozenaHra main(String[] args) {

        int cislo = 1;
        String nazevSouboru = "ulozena hra " + cislo + ".txt";
        int krok = 0;

        String hadaneSlovo = "";                                                    // hádané Slovo
        String napoveda = "";                                                       // nápověda
        String text_nastNapoveda;
        boolean nastNapoveda = false;                                              // zobrazena napovedy
        String text_pocetZivotu;
        int pocetZivotu = 1;                                                        // počet životů
        String text_pocetUhadnuti;
        int pocetUhadnuti = 1;                                                      // počet uhodnutí
        String zadanaPismena = "";                                                  // jiz dríve zadane pismena
        String text_obrazek;
        int obrazek = 11;                                                           // zobrazeny obrázek
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

        //----------------------------------------------------------------------Precteni ze souboru napovedy
        try {
            FileReader in = new FileReader(nazevSouboru);
            BufferedReader br = new BufferedReader(in);
            String strLine;
            char pocet;
            while ((strLine = br.readLine()) != null) {   //precte radek 

                pocet = strLine.charAt(0);                // zjisti prvni znak
                if (pocet != '/') {                       // odfiltruje texty v napovede

                    switch (krok) {
                        case 0:
                            hadaneSlovo = strLine;
                            break;
                        case 1:
                            napoveda = strLine;
                            break;
                        case 2:
                            text_nastNapoveda = strLine;
                            try {
                                nastNapoveda = Boolean.parseBoolean(text_nastNapoveda);
                            } catch (Exception d) {
                                System.out.println("spatna hodnota: nastaveni napovědy");
                                System.out.println("automaticky nastaveno: " + nastNapoveda);
                            }
                            break;
                        case 3:
                            text_pocetZivotu = strLine;
                            try {
                                pocetZivotu = Integer.parseInt(text_pocetZivotu);
                            } catch (Exception d) {
                                System.out.println("spatna hodnota: počet životů");
                                System.out.println("automaticky nastaveno: " + pocetZivotu);
                            }
                            break;
                        case 4:
                            text_pocetUhadnuti = strLine;
                            try {
                                pocetUhadnuti = Integer.parseInt(text_pocetUhadnuti);
                            } catch (Exception c) {
                                System.out.println("spatna hodnota: počet uhádnutí");
                                System.out.println("automaticky nastaveno: " + pocetUhadnuti);
                            }
                            break;
                        case 5:
                            zadanaPismena = strLine;
                            break;
                        case 6:
                            text_obrazek = strLine;
                            try {
                                obrazek = Integer.parseInt(text_obrazek);
                            } catch (Exception d) {
                                System.out.println("spatna hodnota: zvoleny obrazek");
                                System.out.println("automaticky nastaveno: " + obrazek);
                            }
                            break;
                        case 7:
                            pi1 = "" + strLine.charAt(0);
                            break;
                        case 8:
                            pi2 = "" + strLine.charAt(0);
                            break;
                        case 9:
                            pi3 = "" + strLine.charAt(0);
                            break;
                        case 10:
                            pi4 = "" + strLine.charAt(0);
                            break;
                        case 11:
                            pi5 = "" + strLine.charAt(0);
                            break;
                        case 12:
                            pi6 = "" + strLine.charAt(0);
                            break;
                        case 13:
                            pi7 = "" + strLine.charAt(0);
                            break;
                        case 14:
                            pi8 = "" + strLine.charAt(0);
                            break;
                        case 15:
                            pi9 = "" + strLine.charAt(0);
                            break;
                        case 16:
                            pi10 = "" + strLine.charAt(0);
                            break;
                        case 17:
                            pi11 = "" + strLine.charAt(0);
                            break;
                        case 18:
                            pi12 = "" + strLine.charAt(0);
                            break;
                        default: 
                            break;
                    }
                    krok++;
                } else {
                }
            } //konec while


        } catch (Exception a) {
            System.out.println("chyba načtení uložené hry");
        }

        //----------------------------------------------------------------------Ukoncene nacteni a prevodu hodnot

        System.out.println("nacteni hry dokončeno");

        typUlozenaHra ulozenaHra1 = new typUlozenaHra(hadaneSlovo, napoveda, nastNapoveda, pocetZivotu, pocetUhadnuti, zadanaPismena, obrazek, pi1, pi2, pi3, pi4, pi5, pi6, pi7, pi8, pi9, pi10, pi11, pi12);
        return ulozenaHra1;

    }
}
