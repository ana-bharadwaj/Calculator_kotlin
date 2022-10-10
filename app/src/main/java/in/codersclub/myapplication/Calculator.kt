package `in`.codersclub.myapplication

import android.media.VolumeShaper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Calculator : AppCompatActivity() {
  lateinit var ETnumber1: EditText
  lateinit var ETnumber2: EditText
  lateinit var EtResult : EditText
  lateinit var addition_btn : Button
  lateinit var subtraction_btn : Button
  lateinit var multiply_btn: Button
  lateinit var divide_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        ETnumber1 = findViewById(R.id.ETnumber1)
        ETnumber2 = findViewById(R.id.ETnumber2)
        EtResult = findViewById(R.id.EtResult)
        addition_btn = findViewById(R.id.addition_btn)
        subtraction_btn = findViewById(R.id.subtraction_btn)
        multiply_btn = findViewById(R.id.multiply_btn)
        divide_btn = findViewById(R.id.divide_btn)

        addition_btn.setOnClickListener{
            val a = ETnumber1.text.toString().toInt()
            val b = ETnumber2.text.toString().toInt()
            Add(a,b)

    }
        subtraction_btn.setOnClickListener {
            val a = ETnumber1.text.toString().toInt()
            val b = ETnumber2.text.toString().toInt()
            Sub(a,b)
        }
        multiply_btn.setOnClickListener {
            val a = ETnumber1.text.toString().toInt()
            val b = ETnumber2.text.toString().toInt()
            Mul(a,b)
        }
        divide_btn.setOnClickListener {
            val a = ETnumber1.text.toString().toInt()
            val b = ETnumber2.text.toString().toInt()
            Divide(a,b)
        }


    }

   private  fun Add(a:Int,b:Int) {
        val result = a+b
        EtResult.setText(result.toString())
    }
    private fun Sub(a:Int,b:Int){
        val result = a-b
        EtResult.setText(result.toString())

    }
    private fun Mul(a:Int,b:Int){
        val result= a*b
        EtResult.setText(result.toString())

    }
    private fun Divide(a:Int,b:Int){
        val result= a/b
        EtResult.setText(result.toString())
    }

}



    /*fun Divide(view: android.view.View) {
        val num1 = EtNumber1.text.toString().toDouble()
        val num2 = EtNumber2.text.toString().toDouble()
        val result = num1 / num2
        Etresult.setText(result.toString())

    }
    /*fun Mul(view: android.view.View) {
        val num1 = EtNumber1.text.toString().toDouble()
        val num2 = EtNumber2.text.toString().toDouble()
        val result = num1 * num2
        Etresult.setText(result.toString())
    }
    fun Sub(view: android.view.View) {
        val num1 = EtNumber1.text.toString().toDouble()
        val num2 = EtNumber2.text.toString().toDouble()
        val result = num1 - num2
        Etresult.setText(result.toString())
    }
    fun Add(view: android.view.View) {
        val num1 = EtNumber1.text.toString().toDouble()
        val num2 = EtNumber2.text.toString().toDouble()
        val result = num1 + num2
        Etresult.setText(result.toString())


    }


}

     */
     */

