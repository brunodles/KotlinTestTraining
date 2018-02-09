package concrete.workshop.kotlinrobots

import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    val rule = ActivityTestRule(MainActivity::class.java, true, true)

    @Test
    fun shouldSum() {
        actions {
            first("1")
            second("2")
            sum()
        }
        expected {
            total("3")
        }
    }

    @Test
    fun shouldSumToo() {
        MyActions()
                .first("2")
                .second("2")
                .sum()
        MyResult()
                .total("4")
    }

    @Test
    fun shouldFailure() {
        MyActions()
                .first("a")
                .second("b")
                .sum()
        MyResult()
                .showErrorMessage()
    }
}

private fun actions(func: MyActions.() -> Unit) = MyActions().apply { func() }

fun ViewInteraction.typeText(value: String) =
        this.perform(ViewActions.typeText(value))

private fun expected(func: MyResult.() -> Unit) = MyResult().apply { func() }

