package com.example.optionmenu

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

     lateinit var  linearLayout:LinearLayout
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayout=findViewById(R.id.linearLayout)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.red->{

                Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show()
                linearLayout.setBackgroundColor(Color.parseColor("#F32727"))

            }

            R.id.Green->{

                Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show()
                linearLayout.setBackgroundColor(Color.parseColor("#53D51C"))

            }
            R.id.blue->{

                Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show()
                linearLayout.setBackgroundColor(Color.parseColor("#2944DD"))

            }
        }
        return true
    }
}