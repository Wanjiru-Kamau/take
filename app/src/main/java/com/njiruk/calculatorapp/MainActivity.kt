package com.njiruk.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilnum1:TextInputLayout
    lateinit var etnum1:TextInputEditText
    lateinit var tilnum2:TextInputLayout
    lateinit var etnum2:TextInputEditText
    lateinit var btnadd:Button
    lateinit var btnsub:Button
    lateinit var btnmult:Button
    lateinit var btndiv:Button
    lateinit var tvresults:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btnadd)
        btndiv = findViewById(R.id.btndiv)
        btnmult = findViewById(R.id.btnmult)
        btnsub = findViewById(R.id.btnsub)
        tvresults = findViewById(R.id.tvresults)

        btnsub.setOnClickListener {
            var sub = etnum1.text.toString().toInt()
            var sub2 = etnum2.text.toString().toInt()
            Subtraction(sub,sub2)

        }
        btnadd.setOnClickListener {
            var add = etnum1.text.toString().toInt()
            var add2 = etnum2.text.toString().toInt()
            Addition(add,add2)
        }
        btndiv.setOnClickListener {
            var div = etnum1.text.toString().toInt()
            var div2 = etnum2.text.toString().toInt()
            Division(div,div2)
        }
        btnmult.setOnClickListener {
            var mult = etnum1.text.toString().toInt()
            var mult2 = etnum2.text.toString().toInt()
            Multiplication(mult,mult2)
        }
    }
    fun Subtraction(sub:Int,sub2:Int){
        var minus = sub-sub2
        tvresults.text=minus.toString()
    }
    fun Addition(add:Int,add2:Int){
        var plus = add+add2
        tvresults.text=plus.toString()
    }
    fun Division(div:Int,div2:Int){
        var over = div/div2
        tvresults.text=over.toString()
    }
    fun Multiplication(mult:Int,mult2:Int){
        var times = mult*mult2
        tvresults.text=times.toString()
    }



}