package co.prandroid.spekexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Float.parseFloat

class MainActivity : AppCompatActivity() {

    var grade=Grade()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun btnCheck(view:View){

        var gradeText=editTextInput.text.toString()

        if(gradeText.isNullOrBlank()){
            return Toast.makeText(applicationContext, "Marks could not be empty", Toast.LENGTH_SHORT).show()
        } else if (!checkProperValue(gradeText))
            return Toast.makeText(applicationContext,"Please give proper marks",Toast.LENGTH_SHORT).show()

         var gradeAfterCalculation = grade.calculate(gradeText.toFloat());
            textViewOutput.text = gradeAfterCalculation
    }

    fun  checkProperValue(gradeText: String): Boolean {
        try {
            if(gradeText.toFloat()>=0 && gradeText.toFloat()<=100){
                return true
            }
        } catch (e: NumberFormatException) {
           return false
        }

        return false
    }


    class Grade:GradeI{
        override fun calculate(num: Float):String {
            when(num){
                in 95.0 ..100.0 ->return "A+"
                in 90.0 ..94.0 -> return "A"
                in 84.0 ..89.0 ->return "A-"
                in 80.0 ..83.0 -> return "B+"
                in 74.0 ..79.0 ->return "B"
                in 70.0 ..73.0 ->return "B-"
                else ->return "Fail"
            }
            return num.toString()
        }

    }

    interface GradeI{
        fun calculate(num:Float):String
    }
}
