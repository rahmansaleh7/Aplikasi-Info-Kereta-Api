package com.example.aplikasisubmissioniqbala.Model;

import java.util.ArrayList;

public class DataKereta {
    public static String[][] data = new String[][]{
            {"Tentang Saya", "Nama : Iqbal Abdurrahman Saleh","https://i.imgur.com/JkdfeRP.jpg"},
            {"Kereta Api Uap","Kereta api uap adalah kereta api yang digerakan dengan uap air yang dihasilkan dari ketel uap yang dipanaskan","https://i.imgur.com/EfYuNT9.jpg"},
            {"Kereta Api Ringan Dijalan","Disebut juga LRT I, beroperasi di jalan bersama dengan lalu lintas kendaraan, tipe ini membutuhkan percepatan dan perlambatan mendekati performansi kendaraan bermotor","https://i.imgur.com/VAQZuiC.jpg"},
            {"Kereta Api Rel Listrik","Kereta Rel Listrik, disingkat KRL, merupakan kereta rel yang bergerak dengan sistem propulsi motor listrik","https://i.imgur.com/EUj82tV.jpg"},
            {"Kereta Api Mono Rail","Kereta api mono rail (kereta api rel tunggal) adalah kereta api yang jalurnya tidak seperti jalur kereta yang biasa dijumpai yang terdiri dari 2 rel paralel tetapi hanya dari satu rel tunggal yang gemuk dengan profil sedemikian sehingga tidak menyebabkan kereta keluar dari relnya","https://i.imgur.com/3EgRqkw.jpg"},
            {"Kereta Api Diesel","Lokomotif diesel adalah jenis lokomotif yang bermesin diesel dan umumnya menggunakan bahan bakar mesin dari solar","https://i.imgur.com/OzHUlVK.jpg"},
            {"Kereta Api Daya Magnet","Kereta api ini disebut juga sebagai Maglev sebagai singkatan dari Magnetic Levitation dimana kereta diangkat dengan menggunakan medan magnit dan didorong dengan medan magnit juga","https://i.imgur.com/HL9kURw.jpg"},
            {"Kereta Api CC200","Lokomotif CC200 dengan nomor model Alco-GE UM 106T adalah lokomotif diesel elektrik berkabin ganda pertama di Indonesia, buatan pabrik General Electric tahun 1953","https://i.imgur.com/p0mNJPC.jpg"},
            {"Kereta Api BB204","Lokomotif BB 204 merupakan satu-satunya lokomotif diesel elektrik di Indonesia buatan Schweizerische Lokomotiv- und Maschinenfabrik (SLM), Swiss yang khusus dioperasikan pada jalan rel bergigi. Lokomotif ini sudah ada di Indonesia sejak 1981","https://i.imgur.com/xKVmCBq.jpg"},
            {"Kereta Api Bawah Tanah","Kereta api bawah tanah adalah kereta api yang berjalan dalam terowongan dibawah permukaan tanah, merupakan solusi yang ditempuh untuk mengatasi persilangan sebidang","https://i.imgur.com/C7UlC13.jpg"},
    };

    public static ArrayList<Kereta> getListData(){
        ArrayList<Kereta> list = new ArrayList<>();
        for (String[] aData : data) {
            Kereta kereta = new Kereta();
            kereta.setNama(aData[0]);
            kereta.setKeterangan_kereta(aData[1]);
            kereta.setPhoto(aData[2]);

            list.add(kereta);
        }

        return list;
    }
}
