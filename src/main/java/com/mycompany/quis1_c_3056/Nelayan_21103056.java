/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_c_3056;

/**
 *
 * @author WIN 11
 */
public class Nelayan_21103056 extends Penduduk_21103056 {
    int jmlBeratIkan_3056;
    int jmlSolar_3056;
    double totalPendapatNelayan_3056;

    public Nelayan_21103056(int jmlBeratIkan_3056, int jmlSolar_3056, double totalPendapatNelayan_3056, String nik_3056, String nama_3056, int umur_3056, String alamat_3056) {
        super(nik_3056, nama_3056, umur_3056, alamat_3056);
        this.jmlBeratIkan_3056 = jmlBeratIkan_3056;
        this.jmlSolar_3056 = jmlSolar_3056;
        this.totalPendapatNelayan_3056 = totalPendapatNelayan_3056;
    }
    
    public double totalPendapatNelayan() {
        return totalPendapatNelayan_3056 = (jmlBeratIkan_3056 * 8000) - (jmlSolar_3056 * 10000);
    }
    
    public void DataNelayan(){
        System.out.println("Jumlah Berat Ikan  : " + jmlBeratIkan_3056);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar_3056);
        System.out.println("Total Pendapatan : Rp. "+totalPendapatNelayan());
    }
}
