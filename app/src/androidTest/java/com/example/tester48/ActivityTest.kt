package com.example.tester48

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ActivityTest {

    @Rule
    @JvmField
    var rule:ActivityScenarioRule <*> =ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd(){
        runBlocking {
            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.secondEd)).perform(closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.secondEd)).perform(closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.calculate)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("9")))

        }
        }
}