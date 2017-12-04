/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seminarka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

/**
 *
 * @author Armaster
 */
public class nahodneSlovo {

    public static typSlovo main(String[] args) {

        //--------------------------------------------------------------------- load nastavení \/
        System.out.print("při výběru náhodného slova bylo ");
        typNastaveni nastaveniHry = loadNastaveni.main(args);
        //boolean nast_napoveda = nastaveniHry.getNast_napoveda();
        int nast_delkaSlov = nastaveniHry.getNast_delkaSlov();                  // využije pouze delku slov
        //int nast_zivoty = nastaveniHry.getNast_zivoty();


        //--------------------------------------------------------------------- načteni slov z databáze \/


        String text = "";
        String napoveda = "";
        int krok = 1;
        String nazevSouboru = "databaze.txt";
        typSlovo vybraneSlovo = new typSlovo("chyba", "slovo nebylo nacteno");
        typSlovo[] poleSlov;
        poleSlov = new typSlovo[250];                              //pocet slov je omezen na 250
        boolean ulozit = true;
        int pocetPrvku = 0;


        try {

            FileReader cteckaSouboru = new FileReader(nazevSouboru);
            BufferedReader cteckaRadku = new BufferedReader(cteckaSouboru);
            String radek;
            char znaky;

            while ((radek = cteckaRadku.readLine()) != null) {   //precte radek 

                znaky = radek.charAt(0);                        // zjisti prvni znak
                if (znaky != '/') {                             // odfiltruje napovedu v textu


                    if ((krok % 2) != 0) {
                        text = radek;
                        if (text.length() <= nast_delkaSlov) {                   // kontola jestli je slovo v pozadovane delce
                            ulozit = true;
                        } else {
                            ulozit = false;
                        }

                    } else {
                        napoveda = radek;
                        if (ulozit == true) {
                            poleSlov[pocetPrvku] = new typSlovo(text, napoveda);
                            pocetPrvku++;
                        }

                    }

                    krok++;

                } else {
                }

            } //konec while


            if (pocetPrvku != 0) {                          //kontrola zda bylo nalezeno nějaké slovo

                //------------------------------------------------------------------ Vybrání jednoho slova \/

                Random generator = new Random();
                int nahodneCislo = generator.nextInt(pocetPrvku);

                vybraneSlovo = poleSlov[nahodneCislo];

                String vybraneText = vybraneSlovo.getText();
                int vybraneDelka = vybraneSlovo.getDelka();
                String vybraneNapoveda = vybraneSlovo.getNapoveda();

                //System.out.println("náhodné slovo načteno");

                /*                                              // (ne)vypsání načteného slova
                 System.out.println("" + vybraneText);
                 System.out.println("" + vybraneNapoveda);
                 System.out.println("" + vybraneDelka);
                 */
            } else {
                System.out.println("byla nastavena špatná délka slova. Přeuložte nastavení obtížnosti.");
            }



        } catch (Exception a) {
            System.out.println("chyba načtení náhodného slova");
        }


        return vybraneSlovo;

    }
}
