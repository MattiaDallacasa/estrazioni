/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrazioni;

/**
 *
 * @author D4RK
 */

import java.util.Random;

public class Operazioni {
    
    int valori[] = new int[100];
    
    public int getLength() {
        return valori.length;
    }
    
    public void genera(){
            for(int i = 0; i<100; i++){
            valori[i]= (int) (Math.random()*100 + 1);
            }
        }
    public void numeroMaggiore() {
        int max = 0;
        for(int i=0; i<valori.length; i++) {
            if(valori[i]>max) {
                max=valori[i];
            }
        }
    System.out.println("il numero più grande e': "+max);
    }

    public void numeroMinore() {
        int min = 0;
        for(int i= 0; i <valori.length; i++){
            if (min > valori[i]) {
            min = valori[i];    }
        }
        System.out.println("il numero più piccolo e': "+min);
    }

    public void media() {
        int med = 0;
        for(int i =0; i<valori.length; i++) {
            med = valori[i] +med;
        }
    med = med/100;
    System.out.println("la media e': "+med);
    }

    public void percentuali() {
        int pari=0;
        int dispari=0;
        for(int i = 0; i<valori.length; i++) {
            if (valori[i]%2==0){
                pari++;
            }else {
                dispari++;
            }
        }
        System.out.println("la percentuale dei numeri pari e'; "+(pari * 100 / valori.length) +"&");
        System.out.println("la percentuale dei numeri dispari e'; "+(dispari * 100 / valori.length) +"&");
    }
    public void bubbleSort() {
        for(int i=0; i<valori.length; i++) {
            for (int j=0; j<valori.length-1; j++){
                if(valori[j]>valori[j+1]) {
                    int k= valori[j];
                    valori[j] = valori[j+1];
                    valori[j+1] = k;
                }
            }
       }
    }


}
