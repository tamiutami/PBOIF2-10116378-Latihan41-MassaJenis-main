/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
  * Deskripsi Program : Program untuk mencari massa jenis didalam bangun ruang kubus
 */
public class Kubus {
    private int sisi;
    private int massa;
    
    public int getSisi(){
        return sisi;
    }
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        // volume kubus = sisi * sisi * sisi
        return (int)Math.pow(parSisi,3);
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        // Massa Jenis Kubus = massa/volume
        return parMassa/volume;
    }
    
}
