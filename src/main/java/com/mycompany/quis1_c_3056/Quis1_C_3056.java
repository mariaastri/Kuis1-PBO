/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_c_3056;

/**
 *
 * @author WIN 11
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Quis1_C_3056 {

    public static void main(String[] args) {
        //Menambahkan object
        Nelayan_21103056 n1 = new Nelayan_21103056(0,0,0,"","",0,"");
        Nelayan_21103056 n2 = new Nelayan_21103056(0,0,0,"","",0,"");
        Dokter_21103056 d1 = new Dokter_21103056(0,0,0,"","",0,"");
        Dokter_21103056 d2 = new Dokter_21103056(0,0,0,"","",0,"");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK : ");
            n1.nik_3056 = br.readLine();
            System.out.println("Nama : ");
            n1.nama_3056 = br.readLine();
            System.out.println("Umur : ");
            n1.umur_3056 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n1.alamat_3056 = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n1.jmlBeratIkan_3056 = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n1.jmlSolar_3056 = Integer.parseInt(br.readLine());
          
            System.out.println();

            System.out.println("NIK : ");
            n2.nik_3056 = br.readLine();
            System.out.println("Nama : ");
            n2.nama_3056 = br.readLine();
            System.out.println("Umur : ");
            n2.umur_3056 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n2.alamat_3056 = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n2.jmlBeratIkan_3056 = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n2.jmlSolar_3056 = Integer.parseInt(br.readLine());
            
            System.out.println();

            System.out.println("NIK : ");
            d1.nik_3056 = br.readLine();
            System.out.println("Nama : ");
            d1.nama_3056 = br.readLine();
            System.out.println("Umur : ");
            d1.umur_3056 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d1.alamat_3056 = br.readLine();
            System.out.println("Jml Pasien : ");
            d1.jmlPasien_3056 = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d1.jmlObat_3056 = Integer.parseInt(br.readLine());
            

            System.out.println();

            System.out.println("NIK : ");
            d2.nik_3056 = br.readLine();
            System.out.println("Nama : ");
            d2.nama_3056 = br.readLine();
            System.out.println("Umur : ");
            d2.umur_3056 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d2.alamat_3056 = br.readLine();
            System.out.println("Jml Pasien : ");
            d2.jmlPasien_3056 = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d2.jmlObat_3056 = Integer.parseInt(br.readLine());
       

            System.out.println("=========== DATA NELAYAN ===========");
            n1.tampilDataPenduduk();
            n1.totalPendapatNelayan();
            n1.DataNelayan();
            
            System.out.println();
            
            n2.tampilDataPenduduk();
            n2.totalPendapatNelayan();
            n2.DataNelayan();
            
            
            System.out.println("=========== DATA DOKTER ===========");
            
            d1.tampilDataPenduduk();
            d1.totalPendapatDokter();
            d1.DataDokter();
            
            System.out.println();
            
            d2.tampilDataPenduduk();
            d2.totalPendapatDokter();
            d2.DataDokter();

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}
