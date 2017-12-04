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
 * 
 * toto nacita nastavení ze souboru a předává ho pomocí objektu nastaveniTyp
 */
public class loadNastaveni {
    
 public static typNastaveni main(String[] args) {

        String nazevSouboru = "nastaveni.txt";
        String text_napoveda;
        String text_DelkaSlov;
        String text_zivoty;
        boolean nast_napoveda = false;
        int nast_delkaSlov = 12;
        int nast_zivoty = 8;
        int krok = 0;

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
                            text_napoveda = strLine;
                            try {
                                nast_napoveda = Boolean.parseBoolean(text_napoveda);
                            } catch (Exception b) {
                                System.out.println("spatna hodnota: zobrazeni napovedy");
                                System.out.println("automaticky nastaveno: " + nast_napoveda);
                            }
                            break;
                        case 1:
                            text_DelkaSlov = strLine;
                            try {
                                nast_delkaSlov = Integer.parseInt(text_DelkaSlov);
                            } catch (Exception c) {
                                System.out.println("spatna hodnota: delka slov");
                                System.out.println("automaticky nastaveno: " + nast_delkaSlov);
                            }
                            break;
                        case 2:
                            text_zivoty = strLine;
                            try {
                                nast_zivoty = Integer.parseInt(text_zivoty);
                            } catch (Exception d) {
                                System.out.println("spatna hodnota: zivoty");
                                System.out.println("automaticky nastaveno: " + nast_zivoty);
                            }
                            break;
                        default:   //na dalsi radky v souboru napoveda se neprovede nic
                            break;
                    }
                    krok++;
                } else {
                    //System.out.println("tento radek je napoveda v souboru napoveda");
                }
            } //konec while


        } catch (Exception a) {
            System.out.println("chyba načtení nápovědy");
        }

        //----------------------------------------------------------------------Ukoncene  nacteni a prevodu hodnot z napovedy

        
        System.out.println("nacteni nastaveni dokonceno");
        
        typNastaveni nastaveni1 = new typNastaveni(nast_napoveda, nast_delkaSlov, nast_zivoty);
        return nastaveni1;
        
    }

 
}
