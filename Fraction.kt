
fun main(args: Array<String>) {

    var f1 = Fraction()
    var f2 = Fraction()

    f1.numerator = 3.0
    f1.denominator = 6.0
    f2.numerator = 4.0
    f2.denominator = 8.0


    println(f1.toString())
    println(f2.toString())

    println()

    println(f1.equals(f2))

    println()

    println("f1*f2=" + f1.multiplication(f2))

    println()

    println("f1/f2=" + f1.division(f2))

    println()

    println("f1+f2=" + f1.sum(f2))

    println()

    println("f1-f2=" + f1.substraction(f2))

    println()



}

class Fraction {

    var numerator: Double = 0.0
    var denominator: Double = 0.0

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    fun multiplication(exp: Fraction): Double {
        return (numerator / denominator) * (exp.numerator / exp.denominator)
    }

    fun division(exp: Fraction): Double {
        return (numerator / denominator) * (exp.denominator / exp.numerator)

    }

    fun sum(exp: Fraction): Double {
        return (numerator / denominator) + (exp.numerator / exp.denominator)
    }

    fun substraction(exp: Fraction): Double {
        return (numerator / denominator) - (exp.numerator / exp.denominator)
    }

}