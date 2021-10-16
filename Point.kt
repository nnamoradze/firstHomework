fun main(args: Array<String>) {

    val p1 = Point(5, 7, 3)
    val p2 = Point(5, 8, 3)

    println("p1 is koordinatebia - " + p1.toString())
    println("p1 is koordinatebia - " + p2.toString())

    println()

    println("p1-is X > p2-is X - ze aris - " + p1.x.equals(p2.x))
    println("p1-is Y > p2-is Y - ze aris - " + p1.y.equals(p2.y))

    println()

    println("p1-is X gadaadgileba K koeficientit aris - " + p1.movePointX(5, 3))
    println("p1-is Y gadaadgileba K koeficientit aris - " + p1.movePointY(7, 3))

    println()

    println("p2-is X gadaadgileba K koeficientit aris - " + p2.movePointX(5, 3))
    println("p2-is Y gadaadgileba K koeficientit aris - " + p2.movePointY(8, 3))

    println()

    println("p1-is hashcode aris - "+p1.hashCode())
    println("p2-is hashcode aris - "+p2.hashCode())
}

class Point(var x: Int,var y: Int,private var k: Int) {


    override fun toString(): String {

        val coordinateX = x.toString()
        val coordinateY = y.toString()

        return "$coordinateX $coordinateY"
    }

    override fun equals(other: Any?): Boolean {
        return true
    }

    fun movePointX(x: Int, k: Int): Int {

        return x * k

    }

    fun movePointY(y: Int, k: Int): Int {

        return y * k

    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        result = 31 * result + k
        return result
    }


}