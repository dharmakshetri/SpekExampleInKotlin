package co.prandroid.spekexample

import android.support.test.espresso.Espresso.closeSoftKeyboard
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by dharmakshetri on 7/5/17.
 */
@RunWith(AndroidJUnit4::class)
class GradeEspressoTest {
    @Rule @JvmField
    var mainAcivity  =ActivityTestRule<MainActivity>(MainActivity::class.java)

    var name="dharma kshetri"

    @Before
    fun setUp(){

    }

    @Test
    fun testUserInPutSection(){
        onView(withId(R.id.editTextInput)).perform(typeText(name))

        closeSoftKeyboard()

        onView(withId(R.id.buttonCheck)).perform(click())

        onView(withId(R.id.textViewOutput)).check(matches(withText(name)))


    }

    @After
    fun clearRes(){

    }
}