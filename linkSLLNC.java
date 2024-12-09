package coba;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable.*;

public class linkSLLNC {
    public String nama, alamat, hp, barang, jumlah;
    public linkSLLNC next;
    
    public linkSLLNC(){
    
    }
    public linkSLLNC(String n,String a, String h, String b, String j){
        nama = n;
        hp=h;
        barang=b;
        jumlah=j;
        alamat = a;
        
        next = null;
    }
    linkSLLNC head;
    linkSLLNC bantu;
    
    public boolean isEmpty(){
        if(head==null) 
            return true;
        else
            return false;
    }
    
    public void insertBelakang(String namabaru, String hpbaru, 
            String barangbaru, String jumlahbaru, String alamatbaru ){
        linkSLLNC baru;
        baru = new linkSLLNC(namabaru, hpbaru, barangbaru, jumlahbaru, alamatbaru);
        
        if(head == null){
            head = baru;          
        }else{
            bantu = head;
            while(bantu.next != null){
                bantu = bantu.next;
            }            
            bantu.next = baru;
        }
    }
    public void hapusDepan(){
        linkSLLNC hapus;
        
        if(head.next == null){
            head = null;
        }else{
            hapus = head;
            head = head.next;
            hapus = null;
        }
    } 
    public void printDepan(){
        if(isEmpty()==false){
            bantu = head;
            while(bantu != null){
                bantu.displaynode();
                bantu = bantu.next;
            }
        }
    }
    public void displaynode(){
          
        System.out.println("Nama   : "+nama +
                         "\nNo Hp  : "+hp+
                         "\nBarang : "+barang+
                         "\nJumlah : "+jumlah+
                         "\nAlamat : "+alamat+"\n");
        
    }
}

