package com.example.alertdialougbox

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.aclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        binding?.btn1?.setOnClickListener {
//            val intt = Intent(this,MainActivity2::class.java)
//            startActivity(intt)
//
//        }





        binding?.btn?.setOnClickListener {
            var ad  = AlertDialog.Builder(this)
            ad.setCancelable(false)
            ad.setTitle("Do you want to go?")

            ad.setPositiveButton("Yes"){it,which ->
                val intt = Intent(this,MainActivity2::class.java)
                startActivity(intt)
                Toast.makeText(this, "You are", Toast.LENGTH_SHORT).show()

            }
            ad.setNegativeButton("No"){it,which ->
                Toast.makeText(this, "You are not", Toast.LENGTH_SHORT).show()

            }
            ad.setNeutralButton("Cancel"){it,which ->
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()

            }
            ad.create().show()


        }
    }
}