class Circle (_name: String): Shape (_name) {
    private var radius = 0.0
    private var diameter = 0.0

    fun setDimensions(radius: Double){
        this.radius = radius
        this.diameter = radius * radius
    }

    override fun getArea(): Double {
        return 2 * 3.1415 * diameter
    }


    override fun printDimensions() {
        println("Diameter: $diameter, Radius: $radius")
    }
}