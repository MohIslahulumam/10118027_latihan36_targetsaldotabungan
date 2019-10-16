/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10118027_if_1_latihan36_targetsaldotabungan;

/**
 *
 * @author RYZEN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        targetTabungan nabung = new targetTabungan();
        nabung.saldo = 3500000;
        nabung.bunga = 12;
        int saldoTarget = 6000000;
        
        nabung.targetBulanan(nabung.saldo, saldoTarget);
    }

}
    

