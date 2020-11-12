package com.sumuzu.hitungumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btHitung.setOnClickListener {
            try {
                var thnSekarang = Calendar.getInstance().get(Calendar.YEAR)
                var thnLahir = etTahun.text.toString().toInt()

                var umur = thnSekarang - thnLahir

                tvUmur.text = "Tahun ini umur Anda adalah $umur tahun"

                if(thnLahir > thnSekarang){
                    tvUmur.text = "Anda belum lahir"
                }else{
                    tvUmur.text = "Tahun ini umur Anda adalah $umur tahun"
                }

            }catch (e: NumberFormatException){
                Toast.makeText(this, "Harap masukan angka!!", Toast.LENGTH_LONG).show()
            }
        }

    }

}