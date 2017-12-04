/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seminarka;

/**
 *
 * @author Armaster
 */
public class typSlovo {

    String text = "";
    String napoveda = "";
    int pocet = 1;
    int delka = 0;
    //slovo dalsi = null;

    public typSlovo(String text, String napoveda) {
        this.text = text;
        this.napoveda = napoveda;
        this.pocet = 1;
        
    }

    
    
    
    public String getText() {
        return text;
    }

    public String getNapoveda() {
        return napoveda;
    }
    
    
    public int getPocet() {
        return pocet;
    }

    public int getDelka() {
        int delka = text.length();
        return delka;
    }
}
