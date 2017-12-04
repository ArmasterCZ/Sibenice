/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seminarka;

/**
 *
 * @author Armaster
 */
public class typNastaveni {
        boolean nast_napoveda = false;
        int nast_delkaSlov = 12;
        int nast_zivoty = 8;

    public typNastaveni(boolean nast_napoveda, int nast_delkaSlov,int nast_zivoty) {
        this.nast_napoveda = nast_napoveda;
        this.nast_delkaSlov = nast_delkaSlov;
        this.nast_zivoty = nast_zivoty;
        
    }

    public boolean getNast_napoveda() {
        return nast_napoveda;
    }

    public int getNast_delkaSlov() {
        return nast_delkaSlov;
    }

    public int getNast_zivoty() {
        return nast_zivoty;
    }
        
}
