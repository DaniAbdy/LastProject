package kg.dani.mylastandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LocationInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_info)

        val next4 = findViewById<Button>(R.id.next4)

        next4.setOnClickListener {
            startActivity(Intent(this, Ecology::class.java))
        }
    }
}