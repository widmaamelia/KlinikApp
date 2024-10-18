package com.amelia.klinikapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //spash screen
        //hendle untuk delay selama bebrapa deteik

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this , StarterPageActivity::class.java)
                startActivity(intent)
                finish()

            },3000
        )
        //Task
        ///spash screen
        //page page start screen--> klik button ger start ini pindah ke login
        //pada page login. ketika di klik tulisan sgn up -- > ini pindah ke sign up
        //pada page sign up,ketika di klik login pindah ke login
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}