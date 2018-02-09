package concrete.workshop.kotlinrobots

import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.matcher.ViewMatchers

class MyActions {
    fun first(value: String): MyActions {
        Espresso.onView(ViewMatchers.withId(R.id.firstNumber)).typeText(value)
        return this
    }

    fun second(value: String): MyActions {
        Espresso.onView(ViewMatchers.withId(R.id.secondNumber)).typeText(value)
        return this
    }

    fun sum(): MyActions {
        Espresso.onView(ViewMatchers.withText("Somar")).perform(ViewActions.click())
        return this
    }
}