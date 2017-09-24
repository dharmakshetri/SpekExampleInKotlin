package co.prandroid.spekexample

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Created by dharmakshetri on 7/5/17.
 */

class ExampleUnitTest {

    var mainActivity=MainActivity()
    var mainActivityI:MainActivity.GradeI = MainActivity.Grade()


    @Test
    fun shouldInputIsEmptyOrNot()
    {
        var inputIsEmpty= mainActivity.checkProperValue("")
        assertEquals(inputIsEmpty,false)
    }


    @Test
    fun shouldInputIsStringOrNot()
    {
       var inputIsNotString= mainActivity.checkProperValue("test")
        assertEquals(inputIsNotString,false)
    }

    @Test
    fun shouldProperValueBetween0to100(){
        var checkedValue=mainActivity.checkProperValue("-1")
        assertEquals(checkedValue,false)

        var checkedValue1=mainActivity.checkProperValue("101")
        assertEquals(checkedValue1,false)

        var checkedValue2=mainActivity.checkProperValue("87")
        assertEquals(checkedValue2,true)
    }

    @Test
    fun shouldMarkFailed(){
        var grade=mainActivityI.calculate(44.0F)
        assertEquals(grade,"Fail")
    }
    @Test
    fun shouldMarkAPlus(){
        var grade=mainActivityI.calculate(99.0F)
        assertEquals(grade,"A+")
    }

    @Test
    fun shouldMarkA(){
        var grade=mainActivityI.calculate(94.0F)
        assertEquals(grade,"A")
    }
    @Test
    fun shouldMarkAMinus(){
        var grade=mainActivityI.calculate(86.1F)
        assertEquals(grade,"A-")
    }

    @Test
    fun shouldMarkBPlus(){
        var grade=mainActivityI.calculate(82.5F)
        assertEquals(grade,"B+")
    }

    @Test
    fun shouldMarkB(){
        var grade=mainActivityI.calculate(77.6F)
        assertEquals(grade,"B")
    }

    @Test
    fun shouldMarkBMinus(){
        var grade=mainActivityI.calculate(72.90F)
        assertEquals(grade,"B-")
    }




}