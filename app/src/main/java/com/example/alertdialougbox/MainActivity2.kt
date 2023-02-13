package com.example.alertdialougbox

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class MainActivity2 : AppCompatActivity() {
    var binding1 : ActivityMain2Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding1 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding1?.root)


    }

    override fun onBackPressed() {

        val cd = Dialog(this)
        cd.setContentView(R.layout.custom_dialoug)
        var btn =  cd.findViewById<Button>(R.id.fbtn)
        btn.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Thank you for your feedback" , Toast.LENGTH_LONG).show()
        }
        cd.show()


        // super.onBackPressed()
    }
}

class ActivityMain2Binding {

}
