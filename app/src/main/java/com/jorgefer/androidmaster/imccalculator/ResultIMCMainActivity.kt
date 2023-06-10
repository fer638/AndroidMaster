package com.jorgefer.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.jorgefer.androidmaster.R
import com.jorgefer.androidmaster.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCMainActivity : AppCompatActivity() {
    private lateinit var tvResult:TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalculate:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcmain)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener{ onBackPressed()}
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when(result){
            in 0.00..18.50 -> {  //peso bajo
                tvResult.text = getString(R.string.titleLessWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tvDescription.text = getString(R.string.descriptionLessWeight)
            }
            in 18.51..24.99 -> {  // peso normal
                tvResult.text = getString(R.string.titleNormalWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))

                tvDescription.text = getString(R.string.descriptionNormal)
            }
            in 25.00..29.99 -> {  //sobrepeso
                tvResult.text = getString(R.string.titleHightNormal)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.sobrepaeo))

                tvDescription.text = getString(R.string.descriptionHightNormal)
            }
            in 30.00..99.00 -> {  //obesidad
                tvResult.text = getString(R.string.titleHight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))

                tvDescription.text = getString(R.string.descriptionHigh)
            }
            else -> {//error
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))

                tvDescription.text = getString(R.string.error)
             }
        }

    }

    private fun initComponents() {
        tvIMC = findViewById(R.id.tvIMC)
        tvResult = findViewById(R.id.tvResult)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }
}