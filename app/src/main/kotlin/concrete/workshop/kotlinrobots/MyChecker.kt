package concrete.workshop.kotlinrobots

object MyChecker : Checker {

    override fun sun(first: Int, second: Int): Int = first + second

    override fun isInteger(value: String): Boolean = value.toIntOrNull() != null
}