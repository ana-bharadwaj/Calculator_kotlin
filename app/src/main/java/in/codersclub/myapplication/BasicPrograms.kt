package `in`.codersclub.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*

class BasicPrograms : AppCompatActivity(){
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_small_progrrams)
        val tVTime= this.findViewById(R.id.tVtime) as TextView
        val tVDate = this.findViewById(R.id.tVdate) as TextView
        val date =this.findViewById(R.id.date) as Button
        val time = this.findViewById(R.id.time) as Button

        time.setOnClickListener {
            val currentTime = LocalTime.now()
            tVTime.text=currentTime.toString()
            Toast.makeText(this,"current time",Toast.LENGTH_SHORT).show()
        }
        date.setOnClickListener{
            val currentDate = LocalDate.now()
            tVDate.text= currentDate.toString()
            Toast.makeText(this,"current date",Toast.LENGTH_SHORT).show()
        }
        val items =resources.getStringArray(R.array.Items_list)
        val itemAdapter= ArrayAdapter(this,R.layout.dropdownitem,items)
        val autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        autocompleteTV.setAdapter(itemAdapter)

    fun Clicked(view: android.view.View) {
        if ( items.equals("fruits")){

        }

        }
    }
}