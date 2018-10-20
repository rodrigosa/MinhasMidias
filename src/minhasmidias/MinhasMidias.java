/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhasmidias;

import tools.ListaMidia;

/**
 *
 * @author Rodrigo
 */
public class MinhasMidias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            ListaMidia lista = new ListaMidia();
            lista.listaMidia();
            
        } catch (Exception e) {
        }

    }

}
