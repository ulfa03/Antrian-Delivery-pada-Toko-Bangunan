package coba;

import javax.swing.JOptionPane;

public class DeliveryLinkedList {

    public static void main(String args[]) {
        linkSLLNC linkedlist = new linkSLLNC();
        int ip;
        String nama, hp, barang, jumlah, alamat;

        while (true) {
            ip = Integer.parseInt(JOptionPane.showInputDialog("Pilih : "
                    + "\n1. Insert List Kiriman Hari ini"
                    + "\n2. Konfirmasi kiriman"
                    + "\n3. Exit"));
            switch (ip) {
                case 1:
                    nama = JOptionPane.showInputDialog("Masukkan nama customer: ");
                    hp = JOptionPane.showInputDialog("Masukkan no hp customer: ");
                    barang = JOptionPane.showInputDialog("Masukkan nama barang pesanan: ");
                    jumlah = JOptionPane.showInputDialog("Masukkan jumlah barang pesanan: ");
                    alamat = JOptionPane.showInputDialog("Masukkan alamat customer: ");
                    linkedlist.insertBelakang(nama, hp, barang, jumlah, alamat);
                    System.out.println("List Kiriman Hari ini\n"
                            + "-------------------------------------");
                    linkedlist.printDepan();
                    break;
                case 2:
                    if (linkedlist.isEmpty() == true) {
                        JOptionPane.showMessageDialog(null, "Barang Kosong!");
                    } else {
                        linkedlist.hapusDepan();
                        JOptionPane.showMessageDialog(null, "Barang berhasil dikirim");
                        System.out.println("Sisa List Kiriman Hari ini\n"
                                + "-------------------------------------");
                        linkedlist.printDepan();
                    }
                    break;
                case 3:
                    linkedlist.printDepan();
                    JOptionPane.showMessageDialog(null, "Terimakasih");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak ada");
            }
        }
    }
}
