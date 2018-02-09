package concrete.workshop.kotlinrobots

object MyChecker : Checker {

    override fun sum(first: Int, second: Int) = first + second

    override fun isInteger(value: String): Boolean = value.toIntOrNull() != null
}