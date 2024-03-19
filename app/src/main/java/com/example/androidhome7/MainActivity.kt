package com.example.androidhome7

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var image:ImageView
    private lateinit var alisherEt:EditText
    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = this.findViewById(R.id.iv_whatsapp)
        alisherEt = this.findViewById(R.id.et_number)
        button = this.findViewById(R.id.btn_whatsapp)
        toGoWhatsapp()
    }

    private fun toGoWhatsapp() {
        button.setOnClickListener {
            val phoneNumber = alisherEt.text.toString().trim()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber")
            startActivity(intent)
        }
    }
}