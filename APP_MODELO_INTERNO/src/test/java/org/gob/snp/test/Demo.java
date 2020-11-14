/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

/**
 *
 * @author gusn8
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String str = "Hola Mundo";
        System.out.println("" + str);
        char[] tmp = str.toCharArray();
        tmp[5] = '_';
        str = new String(tmp);
        System.out.println("" + str);

    }

}
