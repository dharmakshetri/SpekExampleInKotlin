package co.prandroid.spekexample

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import org.junit.Assert.assertEquals


import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith



/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnitPlatform::class)
class ExampleSpekTest : Spek({


    var grade:MainActivity.GradeI= MainActivity.Grade()
    var result:String

    describe("Testing Faile"){
            result=grade.calculate(99.00F)
            println("result: $result")

            it("check the failed"){
                assertEquals("B+", result)
            }
        }

    val result1 = 10

    it("should return 10") {
        assertEquals(result1, 110)
    }

    given("give test"){
        on("on test"){
            result=grade.calculate(22.00F)
            println("result: $result")

            it("checked failed"){
                assertEquals("Failed", result)
            }
        }
    }

})
