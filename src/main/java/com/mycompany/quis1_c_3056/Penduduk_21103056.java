/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_c_3056;

/**
 *
 * @author WIN 11
 */
public class Penduduk_21103056 {
    protected String nik_3056;
    protected String nama_3056;
    protected int umur_3056;
    protected String alamat_3056;

    public Penduduk_21103056(String nik_3056, String nama_3056, int umur_3056, String alamat_3056) {
        this.nik_3056 = nik_3056;
        this.nama_3056 = nama_3056;
        this.umur_3056 = umur_3056;
        this.alamat_3056 = alamat_3056;
    }
    

    public void tampilDataPenduduk() {
        System.out.println("Data Penduduk : ");
        System.out.println();
        System.out.println("NIK : " + nik_3056);
        System.out.println("Nama : " + nama_3056);
        System.out.println("Umur : " + umur_3056);
        System.out.println("Alamat : " + alamat_3056);

    }
}
