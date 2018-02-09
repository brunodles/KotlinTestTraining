package concrete.workshop.kotlinrobots

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers

class MyResult {

    fun total(expected: String) {
        Espresso.onView(ViewMatchers.withText("Sum total $expected")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    fun showErrorMessage() {
        Espresso.onView(ViewMatchers.withText("Ow, tá errado isso ai!")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}