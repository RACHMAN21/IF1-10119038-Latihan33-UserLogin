/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan33.userlogin;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deksripsi Program : program ini berisi user login dengan konsep pendekatan
 *                     berbasis objek
 */

import java.util.Scanner; // import kelas scanner

public class Tester {
    private static String usName,passWord;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Username = ");
        usName = sc.next();
        
        System.out.print("Masukkan Password = ");
        passWord = sc.next();
        
        System.out.println();
        User login = new User();
        login.pengecekanLogin(usName, passWord);
    }
}