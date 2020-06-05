package com.example.e_jurnal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textyarimil.setOnClickListener {
            val intent = Intent(this, YarimillikActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        textillik.setOnClickListener {
            val intent = Intent(this, IllikActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        imgederslik.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("http://www.e-derslik.edu.az/site/index.php"))
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        imgschool.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/playlist?list=PLmurSRyhshyjqi21ah3rK20osuCC7D2f2&fbclid=IwAR2jVYEb6Tw52NYqwEPuwJrw3gu9Ow9DHuZWUum1cDsMzuDMzqNXQzbVn5A")
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        imgkarabag.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.virtualkarabakh.az/")
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        elaqe.setOnClickListener {
            val intent = Intent(this, ElaqeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}
