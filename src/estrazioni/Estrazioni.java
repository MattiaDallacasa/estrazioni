/*
 * Estrazioni con controllo versione.
 */
package estrazioni;

/**
 *
 * @author D4RK
 */

public class Estrazioni {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operazioni a = new Operazioni();
        a.genera();
        for (int i=0; i<a.getLength(); i++) {
            System.out.print(a.valori[i] + " ");
        }
        System.out.println();
        a.numeroMaggiore();
        a.numeroMinore();
        a.media();
        a.percentuali();
        a.bubbleSort();
        for (int i=0; i<a.getLength(); i++) {
            System.out.print(a.valori[i] + " ");
        }
        System.out.println();
    }
}
