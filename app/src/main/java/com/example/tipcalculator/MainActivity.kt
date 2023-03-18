package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag:Double=1.0
        var btn:Button=findViewById(R.id.button)
        var bil_amount:EditText=findViewById(R.id.num1)
        var result:TextView=findViewById(R.id.tip_amount)
        var spinner_val:Spinner=findViewById(R.id.spinner)
        var option= arrayOf(0.05,0.10,0.15,0.20)
        spinner_val.adapter=ArrayAdapter<Double>(this,android.R.layout.simple_list_item_1,option)
        spinner_val.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override  fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long){
                flag=option.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        btn.setOnClickListener(){
            var x:Double=bil_amount.text.toString().toDouble()
            var total=x*flag
            result.text=total.toString()
        }


    }
}