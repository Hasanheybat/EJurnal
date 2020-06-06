package com.example.e_jurnal

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import kotlinx.android.synthetic.main.activity_illik.*

class IllikActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_illik)

        imglogo2.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }

    fun btnhesablail (view: View) {
        try {
            if ((!TextUtils.isEmpty(this.kqs1.getText().toString()))  && (!TextUtils.isEmpty(this.kqs2.getText().toString()))) {

                var ksq1: Float = kqs1.getText().toString().toFloat()
                var ksq2: Float = kqs2.getText().toString().toFloat()


                if (ksq1 <= 100.0F && ksq1 >= 0.0F) {
                    textView7.setTextColor(Color.parseColor("#00E1BA"))
                } else {
                    textView7.setTextColor(Color.parseColor("#84254A"))
                }
                if (ksq2 <= 100.0F && ksq2 >= 0.0F) {
                    textView8.setTextColor(Color.parseColor("#00E1BA"))
                } else {
                    textView8.setTextColor(Color.parseColor("#84254A"))
                }

                if ((ksq1 <= 100.0F) && (ksq1 >= 0.0F) && (ksq2 <= 100.0F) && (ksq2 >= 0.0F)){

                    var cvb = ((ksq1 + ksq2 ) / 2 )
                    if (cvb <= 30){
                        editcavablar.setText("İllik bal: $cvb \n İllik qiymət: 2 " )
                        editcavablar.setTextColor(Color.parseColor("#00E1BA"))
                        return
                    }
                    else if ((cvb > 30) && (cvb <= 60)) {
                        editcavablar.setText("İllik bal: $cvb \n İllik qiymət: 3 " )
                        editcavablar.setTextColor(Color.parseColor("#00E1BA"))
                        return
                    }
                    else if ((cvb > 60) && (cvb <= 80)) {
                        editcavablar.setText("İllik bal: $cvb \n İllik qiymət: 4 " )
                        editcavablar.setTextColor(Color.parseColor("#00E1BA"))
                        return
                    }
                    else if (cvb > 80) {
                        editcavablar.setText("İllik bal: $cvb \n İllik qiymət: 5 " )
                        editcavablar.setTextColor(Color.parseColor("#00E1BA"))
                        return
                    }
                }
                editcavablar.setText("Ballar 100-dən çox ola bilməz")
                editcavablar.setTextColor(Color.parseColor("#84254A"))
                return
            }
            editcavablar.setText("Bütün xanaları doldurun")
            editcavablar.setTextColor(Color.parseColor("#84254A"))
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    fun btnsifirlail(view: View){
        kqs1.setText("")
        kqs2.setText("")
        textView7.setTextColor(Color.parseColor("#D2D2D2"))
        textView8.setTextColor(Color.parseColor("#D2D2D2"))

        editcavablar.setText("Sıfırlandı")
        editcavablar.setTextColor(Color.parseColor("#84254A"))
    }
}

