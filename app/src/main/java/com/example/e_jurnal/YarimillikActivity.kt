package com.example.e_jurnal

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_ks3_bs.*
import kotlinx.android.synthetic.main.activity_yarimillik.*
import kotlinx.android.synthetic.main.activity_yarimillik.imglogo2


class YarimillikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yarimillik)

        imglogo2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }


    }
    fun btnhaziron (view: View) {
           val checkbox = findViewById<CheckBox>(R.id.checkBox2)
           var b :Int
           if (checkbox.isChecked)
            b = 1
            else
            b = 2
           val secreqem: String = editksq.text.toString()

            if (secreqem > "6" || secreqem < "3") {
                textyarimil.setTextColor(Color.parseColor("#C35F5F"))
                textyarimil.setText("Kiçik summativ qiymətləndirilməsi \n 3-dən kiçik, 6-dan böyük ola bilməz")
            }

            if (secreqem == "3" && b == 2 ) {
                val intent = Intent(this, Ks3BsNoActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }

            if(secreqem == "3" && b == 1) {
               val intent = Intent(this, Ks3BsActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
               startActivity(intent)
            }

            if (secreqem == "4" && b == 2) {
                val intent = Intent(this, Ks4BsNoActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }

            if (secreqem == "4" && b == 1) {
                val intent = Intent(this, Ks4BsActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }

            if (secreqem == "5" && b == 2) {
                val intent = Intent(this, Ks5BsNoActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }

            if (secreqem == "5" && b == 1) {
                val intent = Intent(this, Ks5BsActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }

            if (secreqem == "6" && b == 2) {
                val intent = Intent(this, Ks6BsNoActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }

            if (secreqem == "6" && b == 1) {
                val intent = Intent(this, Ks6BsActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }
        }
    }


