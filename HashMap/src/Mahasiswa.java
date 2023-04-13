import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa{
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String na, String kl, String mat, int ni) {
        nama = na;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri","3H", "Struktur Data", 2021000));
        mhs.put("2", new Mahasiswa("Raka", "3A", "Struktur data", 2021015));
        mhs.put("3", new Mahasiswa("Manda", "3D", "Kalkulus", 2021046));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama +
             "\n" + "Kelas : " + data.kelas + "\n" + "Mata Kuliah : " +
              data.matkulPraktikum + "\n" + "Nim : " + data.nim);
        }

    }
}
