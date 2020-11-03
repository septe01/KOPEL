package com.example.kopel

import com.example.kopel.model.Kopel

object KopelData {

    private val kopelName = arrayOf(
        "Chasing",
        "Motherboard",
        "LCD",
        "Processor",
        "Keyboard",
        "TouchPad",
        "RAM",
        "Harddisk",
        "SSD",
        "Wireless Card"
    )

    private val kopelDetails = arrayOf(
        "Chasing pada laptop berfungsi untuk memasang semua perangkat laptop seperti: motherboard, LCD, dan perangkat lain. Chasing pada laptop juga berfungsi untuk melindungi perangkat keras yang ada didalam laptop.",
        "Motherboard atau Mainboard merupakan sebuah komponen elektronik pada laptop yang berfungsi untuk memasang perangkat dan peripheral utama seperti prosessor, chipset, soundcard, VGA Card, dan perangkat lain untuk mendukung kinerja laptop.",
        "LCD merupakan perangkat yang berfungsi untuk menampilkan hasil proses dari komputer berupa gambar maupun text. LCD adalah pengganti dari layar monitor pada komputer.",
        "Processor merupakan perangkat yang berfungsi sebagai otak dari laptop. Semua aktifitas dan proses akan melalui prosessor sebelum ditampilkan atau dikeluarkan pada perangkat output.",
        "Keyboard merupakan perangkat input yang berfungsi untuk memasukan data berupa angka, huruf dan symbol. Keyboard pada laptop dikemas seminimal mungkin sehingga kelihatan lebih rapi dan efisien.",
        "TouchPad merupakan perangkat input pada laptop yang berfungsi untuk menggerakan pointer pada layar LCD/monitor, Touchpad ini menggantikan peran mouse pada komputer akan tetapi touchpad menggunakan sentuhan untuk menggerakkanya.",
        "RAM (Random Access Memory) merupakan sebuah perangkat yang berfungsi untuk menyimpan data sementara sebelum disimpan secara permanen pada media penyimpanan lainnya. Besarnya RAM akan mempengaruhi kecepatan proses dari laptop tersebut.",
        "Harddisk merupakan sebuah perangkat yang berfungsi untuk menyimpan data secara permanen, Data yanga disimpan pada harddisk tidak akan hilang jika koita tidak menghapusnya. Besarnya kapasitas dari harddisk biasanya mempunyai ukuran Giga. Contoh ukuran kapasitas harddisk 160 GB, 250 GB, 320 GB, dan 500 GB.",
        "SSD (Solid State Drive) adalah tempat penyimpanan data yang memiliki cara kerja yang sangat berbeda dengan HDD. Penjelasan paling mudah untuk SSD adalah di dalamnya, hanya terdapat chip memori yang biasa kita temukan di flash disk. Sehingga, SSD tidak memiliki bagian yang bergerak dan tidak seperti HDD yang di dalamnya bergerak.",
        "Wireless Card merupakan sebuah perangkat kyang berfungsi untuk media perantara tanpa menggunakan kabel. Fungsi utama dari perangkat ini adalah untuk menangkap sinyal wifi dari Access Point atau perangkat lain tanpa menggunakan kabel."
    )

    private val kopelImage = intArrayOf(
        R.drawable.chasing,
        R.drawable.motherboard,
        R.drawable.lcd,
        R.drawable.processor,
        R.drawable.keyboard,
        R.drawable.sentuh,
        R.drawable.ram,
        R.drawable.harddisk,
        R.drawable.ssd,
        R.drawable.wirelesscard
    )

    val listData: ArrayList<Kopel>
    get() {
        val list = arrayListOf<Kopel>()
        for (position in kopelName.indices){
            val kopel = Kopel()
            kopel.name      = kopelName[position]
            kopel.detail    = kopelDetails[position]
            kopel.photo     = kopelImage[position]
            list.add(kopel)
        }
        return list
    }


}