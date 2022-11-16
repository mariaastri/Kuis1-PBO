/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_c_3056;

/**
 *
 * @author WIN 11
 */
public class Dokter_21103056 extends Penduduk_21103056 {
    int jmlPasien_3056;
    int jmlObat_3056;
    double totalPendapatanDokter_3056;

    public Dokter_21103056(int jmlPasien_3056, int jmlObat_3056, double totalPendapatanDokter_3056, String nik_3056, String nama_3056, int umur_3056, String alamat_3056) {
        super(nik_3056, nama_3056, umur_3056, alamat_3056);
        this.jmlPasien_3056 = jmlPasien_3056;
        this.jmlObat_3056 = jmlObat_3056;
        this.totalPendapatanDokter_3056 = totalPendapatanDokter_3056;
    }
    
    public double totalPendapatDokter (){
        return totalPendapatanDokter_3056 = (jmlPasien_3056 * 50000) + (jmlObat_3056 * 10000);
    }
    
    public void DataDokter(){
        System.out.println("Jumlah Pasien : " + jmlPasien_3056);
        System.out.println("Jumlah Obat : " + jmlObat_3056);
        System.out.println("Total Pendapatan : Rp. "+totalPendapatDokter());
    }
    
}
