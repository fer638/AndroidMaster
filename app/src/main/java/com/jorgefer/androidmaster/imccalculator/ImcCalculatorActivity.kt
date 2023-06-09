package com.jorgefer.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
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
    private var currentAge:Int = 30
    private var currentHeihght:Int = 120

    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight:RangeSlider
    //button weight
    private lateinit var btnSubstractWeight: FloatingActionButton
    private lateinit var btnPlusWheight: FloatingActionButton
    private lateinit var tvWeight: TextView
    //butom age
    private lateinit var btnSubstractAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var tvAge: TextView

    private lateinit var btnCalculate:Button


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
        btnSubstractAge = findViewById(R.id.btnSubstractAge)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        tvAge = findViewById(R.id.tvAge)
        btnCalculate = findViewById(R.id.btnCalculate)
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
            currentHeihght = df.format(value).toInt()
            tvHeight.text = "$currentHeihght cm"
        }

        btnPlusWheight.setOnClickListener{
            currentWeight += 1
            setWeight()
        }

        btnSubstractWeight.setOnClickListener{
            currentWeight -= 1
            setWeight()
        }

        btnPlusAge.setOnClickListener{
            currentAge +=1
            setAge()
        }

        btnSubstractAge.setOnClickListener{
            currentAge -=1
            setAge()
        }

        btnCalculate.setOnClickListener{
            calculateImc()
        }
    }

    private fun calculateImc() {
        val df = DecimalFormat("#.##")
        val imc = currentWeight/ (currentHeihght.toDouble()/100 * currentHeihght.toDouble() /100)
        val result = df.format(imc).toDouble()
        Log.i("alaa", "El imc es $result")
    }

    private fun setWeight() {
        tvWeight.text = currentWeight.toString()
    }

    private  fun setAge(){
        tvAge.text = currentAge.toString()
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
        setAge()
    }


}