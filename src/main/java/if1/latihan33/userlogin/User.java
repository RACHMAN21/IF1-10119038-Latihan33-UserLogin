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
 * Deksripsi Program : program ini berisi class user
 */

public class User {
    private final String USERNAME = "RizkiAdam";
    private final String PASSWORD = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        if(USERNAME.equals(parUserName) && PASSWORD.equals(parPassword)) {
            statusAkun = true;
        } else {
            statusAkun = false;
        }
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        if(status) {
            System.out.println("*****HALLO "+parUserName.toUpperCase()+"*****");
            System.out.println("Selamat Datang di Aplikasi ini.");
        } else {
            System.out.println("Ooops, Username atau password anda salah.");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword) {
        cekAkun(parUserName,parPassword);
        hasilLogin(statusAkun,parUserName);
    }
}