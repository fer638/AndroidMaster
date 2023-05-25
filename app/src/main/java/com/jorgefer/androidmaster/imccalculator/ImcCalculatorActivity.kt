package com.jorgefer.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.jorgefer.androidmaster.R
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false
    private var currentWeight:Int = 60

    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight:RangeSlider
    private lateinit var btnSubstractWeight: FloatingActionButton
    private lateinit var btnPlusWheight: FloatingActionButton
    private lateinit var tvWeight: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        initComponents()
        iniListeners()
        initUI()

    }

        //iniciamos componentes
     private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnSubstractWeight = findViewById(R.id.btnSubstractWeight)
        btnPlusWheight = findViewById(R.id.btnPlusWeight)
        tvWeight = findViewById(R.id.tvWeight)

    }

    //lo que va a recibir o esucchar
    private fun iniListeners() {
        viewMale.setOnClickListener{
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener{
            changeGender()
            setGenderColor()
        }

        rsHeight.addOnChangeListener{ _, value, _ ->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text = "$result cm"
        }

        btnPlusWheight.setOnClickListener{
            currentWeight += 1
            setWeight()
        }

        btnSubstractWeight.setOnClickListener{
            currentWeight -= 1
            setWeight()
        }

    }

    private fun setWeight() {
        tvWeight.text = currentWeight.toString()
    }

    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent:Boolean) : Int{


        val colorReference = if(isSelectedComponent){
                R.color.background_component_selected
        }else{
                R.color.background_component
        }

       return ContextCompat.getColor(this, colorReference)
    }

    private fun initUI() {
        setGenderColor()
        setWeight()
    }


}