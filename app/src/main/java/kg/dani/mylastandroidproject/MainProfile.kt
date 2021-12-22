package kg.dani.mylastandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile)

        val next = findViewById<Button>(R.id.next)

        next.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }

    }
}