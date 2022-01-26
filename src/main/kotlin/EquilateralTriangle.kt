import kotlin.math.sqrt

class EquilateralTriangle (_name: String):  Triangle (_name){
    private var side = 0.0

    fun setDimensions(side: Double){
        this.side = side
    }

    override fun getArea(): Double {
        val perimeter = side * side * side
        val s = perimeter/2
        return sqrt(s * (s-side) * (s-side) * (s-side))
    }


    override fun printDimensions() {
        println("SideA: $side, SideB: $side, SideC: $side,")
    }
}