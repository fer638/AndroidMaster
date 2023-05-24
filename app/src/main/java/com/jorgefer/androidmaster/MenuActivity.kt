 package com.jorgefer.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jorgefer.androidmaster.fisrtApp.FirstAppActivity
import com.jorgefer.androidmaster.imccalculator.ImcCalculatorActivity

 class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnSaludApp.setOnClickListener{ navigateToSaludApp() }
        btnIMCApp.setOnClickListener{ navigateToImcApp() }
    }

     private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
         startActivity(intent)
     }

     private fun navigateToSaludApp(){
         val intent = Intent(this, FirstAppActivity::class.java)
         startActivity(intent)
     }
}