package kg.dani.mylastandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile_page)

        val next3 = findViewById<Button>(R.id.next3)

        next3.setOnClickListener {
            startActivity(Intent(this, LocationInfo::class.java))
        }
        }
    }