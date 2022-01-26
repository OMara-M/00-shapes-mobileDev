import kotlin.math.sqrt

open class Triangle (_name: String): Shape (_name) {
    private var sideA = 0.0
    private var sideB = 0.0
    private var sideC = 0.0

    fun setDimensions(sideA: Double, sideB: Double, sideC: Double){
        this.sideA = sideA
        this.sideB = sideB
        this.sideC = sideC
    }

    override fun getArea(): Double {
        val perimeter = sideA + sideB + sideC
        val s = perimeter/2
        return sqrt(s * (s-sideA) * (s-sideB) * (s-sideC))
    }


    override fun printDimensions() {
        println("SideA: $sideA, SideB: $sideB, SideC: $sideC,")
    }
}